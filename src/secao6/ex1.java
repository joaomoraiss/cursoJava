package secao6;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 2002, tentativa;
        boolean acesso = false;
        while (acesso == false){
            System.out.println("Digite a senha:");
            tentativa = sc.nextInt();
            if (tentativa == senhaCorreta) acesso = true;
        }
    }
}
