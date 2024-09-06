package secao8.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle rc = new rectangle();
        System.out.println("Digite a altura e largura do retangulo");
        rc.height = sc.nextDouble();
        rc.width = sc.nextDouble();

        System.out.println(rc.toString());
    }
}
