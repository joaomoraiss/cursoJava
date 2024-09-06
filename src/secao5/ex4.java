package secao5;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int duracaoJogo, inicioJogo, fimJogo;
        System.out.println("Digite a hora que o jogo começou e a hora que o jogo acabou:");
        inicioJogo = input.nextInt();
        fimJogo = input.nextInt();

        if (inicioJogo < fimJogo){
            duracaoJogo = fimJogo + inicioJogo;
        } else duracaoJogo = 24 - fimJogo - inicioJogo;
        System.out.println("O JOGO DUROU "+duracaoJogo+" HORA(s)");
    }
}
