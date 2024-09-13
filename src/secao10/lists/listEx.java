package secao10.lists;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class listEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionarios?");
        int qntdFuncionario = sc.nextInt();
        for (int i = 0; i < qntdFuncionario; i++){
            int id;
            String nome;
            double salario;
            System.out.println("Digite o ID:");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome:");
            nome = sc.nextLine();
            System.out.println("Digite o salario:");
            salario = sc.nextDouble();
            if (funcionarios.stream().anyMatch(x -> x.getId() == id)){
                System.out.println("Id ja adicionado");
                return;
            }else{
                Funcionario funcionario = new Funcionario(id, nome, salario);
                funcionarios.add(funcionario);
            }
        }
        System.out.println("Digite o porcento de aumento e a id do funcionario");
        int pct = sc.nextInt();
        int aumentoId = sc.nextInt();
        if (funcionarios.stream().anyMatch(x -> x.getId() == aumentoId)){
            funcionarios.stream()
                    .filter(f -> f.getId() == aumentoId)
                    .findFirst()
                    .ifPresent(f -> f.aumentoSalario(pct));
        } else {
            System.out.println("Id não encontrado");
            return;
        }
        for (Funcionario j : funcionarios){
            String result = j.toString();
            System.out.println(result);
        }
    }
}
