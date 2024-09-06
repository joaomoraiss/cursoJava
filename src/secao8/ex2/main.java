package secao8.ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        System.out.println("Digite o nome do funcionario");
        f1.nome = sc.next();
        System.out.println("Digite o salario bruto do funcionario:");
        f1.salarioBruto = sc.nextDouble();
        System.out.println("Digite a taxa:");
        f1.tax = sc.nextDouble();

        System.out.println(f1.toString());
    }
}
