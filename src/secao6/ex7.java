package secao6;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int qntd = sc.nextInt();
        for (int i = 0; i < qntd; i++){
            System.out.println("Digite os numeros a serem divididos:");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            if (num2 == 0) System.out.println("Divisão impossivel");
            else System.out.println(num1/num2);
        }
    }
}
