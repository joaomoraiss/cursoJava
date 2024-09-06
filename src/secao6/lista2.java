package secao6;

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double num = 1;
        while ( num > 0 ) {
            System.out.println("Digite o número a ser adicionado:");
            num = sc.nextDouble();
            if (num <=0 ) break;
            soma += num;
        }
        System.out.println("Soma dos numeros adicionados: "+soma);
    }
}
