package secao15.a161;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> produtos = new ArrayList<>();
        String pathRead = "C:\\Users\\joaov\\IdeaProjects\\cursoJAVA\\dados.csv";
        String pathOut = "C:\\Users\\joaov\\IdeaProjects\\cursoJAVA\\dadosout.txt";
        BufferedReader br;
        BufferedWriter bw;
        try {
            br = new BufferedReader(new FileReader(pathRead));
            bw = new BufferedWriter(new FileWriter(pathOut));

            String itemcsv = br.readLine();
            while(itemcsv !=null){
                String[] fields = itemcsv.split(",");
                String name = fields[0];
                Double price = Double.valueOf(fields[1]);
                Double qntd = Double.valueOf(fields[2]);

                Product product = new Product(name, price, qntd);
                double total = product.precoTotal();
                bw.write(name + "," +total+"\n");
                bw.newLine();
                itemcsv = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
