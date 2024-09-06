package secao6;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++){
            if (i % 2 ==1) System.out.println(i);
        }
    }
}
