package httpEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o CEP a ser buscado: ");
        String cep = s.next().toString();
        try {
            StringBuilder apiUrl = new StringBuilder("https://viacep.com.br/ws/")
                    .append(cep)
                    .append("/json");
            String response = sendGetCepHTTPURLCONEC(String.valueOf(apiUrl));
            System.out.println("Reponse:\n" +response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String sendGetCepHTTPURLCONEC(String APIurl) throws IOException {
        URL url = new URL(APIurl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK){
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while((line = reader.readLine()) != null) response.append(line);
            reader.close();
            return response.toString();

        } else return "Failed to get the API response. Response code: "+responseCode;


    }
    public static String sendGetCepHTTPCLIENT()
}
