package secao6;

import java.util.Scanner;

public class lista1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num = sc.nextInt();
        int resultado = num;
        if ( num < 0 ) System.out.println("MENOR QUE ZERO");
        else if ( num > 16 ) System.out.println("OVERFLOW");
        else if ( num == 0 ) System.out.println("Resultado: 1");
        else {
            while (num > 1){
                resultado *= (num-1);
                num--;
            }
            System.out.println("Resultado: "+resultado);
        }
    }
}
