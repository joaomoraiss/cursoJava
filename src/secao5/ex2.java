package secao5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = input.nextInt(); 
        if (num % 2 == 0) System.out.println("PAR");
        else System.out.println("IMPAR");
    }
}
