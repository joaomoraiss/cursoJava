package secao6;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0,gasolina = 0,diesel=0, escolha=0;
        System.out.println("1.Alcool\n2.Gasolina\n3.Diesel\n4.Fim");
        while (escolha !=4){
            escolha = sc.nextInt();
            if (escolha == 1)alcool++;
            else if (escolha ==2)gasolina++;
            else if (escolha == 3)diesel++;
            else if (escolha == 4) System.out.println("MUITO OBRIGADO\nAlcool:"+alcool+
            "\nGasolina:"+gasolina+"\nDiesel:"+diesel);
        }
    }
}
