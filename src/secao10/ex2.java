package secao10;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, media =0;
        System.out.println("Quantos numeros serão digitados?");

        int tamanho = sc.nextInt();
        int[] arr = new int[tamanho];

        for (int i = 0; i < arr.length ; i++){
            System.out.println("Digite um número");
            arr[i] = sc.nextInt();
        }
        System.out.println("Valores: "+ Arrays.toString(arr));
        for (int j : arr) {
            soma += j;

        }
        media = soma/arr.length;
        System.out.println("Soma:" +soma+ "/n"+
                "Media" + media);


    }
}
