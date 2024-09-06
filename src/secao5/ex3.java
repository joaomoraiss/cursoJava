package secao5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois numeros:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0) System.out.println("São Multiplos");
        else System.out.println("Não são multiplos");
    }
}
