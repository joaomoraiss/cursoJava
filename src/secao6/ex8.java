package secao6;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um numero pra saber o fatorial:");
        int num = sc.nextInt();
        int resultado = num;
        while (num > 1 ){
            resultado *= (num-1);
            System.out.println(resultado);
            num--;
        }
        System.out.println(resultado);
    }
}
