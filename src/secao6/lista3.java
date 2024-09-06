package secao6;

import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, multi = 1, mA, mG, mH, somaReciprocos = 0;
        for ( int i = 0; i < 5; i++ ){
            System.out.println("Escreva um número real: ");
            double num = sc.nextDouble();
            soma += num;
            multi *= num;
            somaReciprocos += 1.0 / num;
        }
        mA = soma/5;
        mG = Math.pow(multi, 1.0/5.0 );
        mH = 5 / somaReciprocos;
        System.out.println("Media Aritimetica: "+mA+"\nMedia Geometrica: "+mG+
                "\nMedia Harmonica: "+mH);
    }
}
