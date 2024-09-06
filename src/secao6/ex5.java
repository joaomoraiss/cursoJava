package secao6;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intervalo = 0, naoIntervalo = 0;
        System.out.println("Digite a quantidade de numeros:");
        int qntd = sc.nextInt();
        for (int i = 0; i < qntd; i++){
            System.out.println("Digite um numero:");
            int num = sc.nextInt();
            if (num >= 10 && num <=20) intervalo++;
            else naoIntervalo++;
        }
        System.out.println("No intervalo: "+intervalo+"\n Fora do intervalo: "+naoIntervalo);
    }
}
