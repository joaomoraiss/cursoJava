package secao6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de casos:");
        int qntdCasos = sc.nextInt();
        for (int i = 0; i < qntdCasos; i++){
            System.out.println("Digite as 3 notas:");
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0)/10;
            System.out.println("Media: "+ media);
        }
    }
}
