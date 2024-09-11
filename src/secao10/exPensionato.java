package secao10;

import java.util.Scanner;

public class exPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qntdEstudantes;
        exPensionatoAluno[] quartos = new exPensionatoAluno[10];

        System.out.println("Quantos quartos serão alugados?");
        qntdEstudantes = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= qntdEstudantes; i++){
            int quarto;
            String nome, email;

            System.out.print("Name: ");
            nome = sc.nextLine();

            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.print("Room: ");
            quarto = sc.nextInt();
            sc.nextLine();
            System.out.println("\n");

            exPensionatoAluno aluno = new exPensionatoAluno(quarto, nome, email);
            quartos[quarto] = aluno;
        }

        System.out.println("Busy Rooms:");
        for (exPensionatoAluno quarto : quartos) {
            String result = null;
            if (quarto != null) {
                result = quarto.toString();
                System.out.println(quarto.quarto + ": " + result);
            }
        }
    }
}
