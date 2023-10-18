package secao4;

import java.util.Locale;
import java.util.Scanner;

public class atv04 {
    public static String salario(int funcNum, int horasTrab, double valorHora){
        double salario = horasTrab * valorHora;
        return "Number = "+funcNum+"\n"+"Salary = U$ "+salario;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu número de funcionário, numéro de horas trabalhadas" +
                " e o valor que recebe por horas.");
        int funcionarioNum = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double valorHora = input.nextDouble();
        System.out.println(salario(funcionarioNum, horasTrabalhadas, valorHora));
    }
}
