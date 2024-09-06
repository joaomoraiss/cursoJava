package secao5;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = input.nextDouble();

        double imposto = calcularImpostoDeRenda(salario);

        System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
    }

    public static double calcularImpostoDeRenda(double salario) {
        double imposto = 0.0;

        if (salario <= 2000.00) {
            imposto = 0.0; // Isento de imposto
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
        } else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
        }

        return imposto;
    }
}
