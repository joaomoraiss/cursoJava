package secao6;

import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva dois numeros reais:\n");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Escolha a operação a ser realizada entre os dois numeros\n" +
                "1.Soma\n2.Subtração\n3.Produto\n4.Divisão");
        int escolha = sc.nextInt();
        if (escolha > 4 ) {
            System.out.println("OPC ERRADA");
            return;
        }
        switch (escolha) {
            case 1 -> System.out.println("Soma: " + (num1 + num2));
            case 2 -> System.out.println("Subtração: " + (num1 - num2));
            case 3 -> System.out.println("Produto: " + (num1 * num2));
            case 4 -> {
                if (num1 == 0 || num2 == 0) {
                    System.out.println("DIV ZERO");
                    break;
                }
                System.out.println("Divisão: " + (num1 / num2));
            }
        }
    }
}
