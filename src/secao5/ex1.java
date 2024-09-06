package secao5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = input.nextInt();
        if (num < 0) System.out.println("NEGATIVO");
        else System.out.println("POSITIVO");
    }
}
