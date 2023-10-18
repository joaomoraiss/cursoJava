package secao4;

import java.util.Locale;
import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Digite o valor do raio de um círculo:");
        double raio = input.nextDouble();
        double area = pi * (Math.pow(raio, 2));
        System.out.println("Área: "+area);
    }
}
