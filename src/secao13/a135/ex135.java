package secao13.a135;

import java.util.Scanner;

public class ex135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionarios?");
        int fqtd = sc.nextInt();
        for (int i = 0; i < fqtd; i++) {
            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Horas:");
            int horas = sc.nextInt();
            System.out.println("valor por hora:");
            Double valorpHora = sc.nextDouble();
            Employee employee = new Employee(nome, horas, valorpHora);
        }
    }
}
