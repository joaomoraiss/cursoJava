package secao5;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String quadrante;
        System.out.println("Escreva os dois valores:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (x > 0.0 && y > 0.0)quadrante = "Q1";
        else if (x > 0.0 && y < 0.0)quadrante = "Q4";
        else if (x < 0.0 && y > 0.0)quadrante = "Q2";
        else if (x < 0.0 && y < 0.0)quadrante = "Q3";
        else quadrante = "Origem";
        System.out.println(quadrante);
    }
}
