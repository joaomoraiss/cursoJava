package secao10;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros serão digitados?");
        int tamanho = sc.nextInt();
        int[] arr = new int[tamanho];
        for (int i = 0; i < arr.length ; i++){
            System.out.println("Digite um número");
            arr[i] = sc.nextInt();
        }
        System.out.println("Numeros negativos:");
        for (int j : arr) {
            if (j < 0) System.out.println(j);
        }
    }
}
