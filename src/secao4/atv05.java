package secao4;

import java.util.Scanner;

public class atv05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1" +
                ", o\n" + "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2");
        int cod1 = input.nextInt();
        int pec1 = input.nextInt();
        double valor1 = input.nextDouble();
        int cod2 = input.nextInt();
        int pec2 = input.nextInt();
        double valor2 = input.nextDouble();
        double total = (pec1 * valor1) + (pec2 * valor2);
        System.out.println("Valor a pagar: R$ "+total);
    }
}
