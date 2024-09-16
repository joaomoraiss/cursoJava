package secao10.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class listEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionarios?");
        int qntdFuncionario = sc.nextInt();
        adicionarFuncionario(qntdFuncionario, funcionarios);
        System.out.println("Digite o porcento de aumento e a id do funcionario");
        int pct = sc.nextInt();
        int aumentoId = sc.nextInt();
        aumentarSalario(pct, aumentoId, funcionarios);
        for (Funcionario j : funcionarios){
            String result = j.toString();
            System.out.println(result);
        }
    }
    public static void adicionarFuncionario(int qntdFuncionario, ArrayList<Funcionario> funcionarios){
        Scanner sc = new Scanner(System.in);
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
            }else{
                Funcionario funcionario = new Funcionario(id, nome, salario);
                funcionarios.add(funcionario);
            }
        }
    }
    public static void aumentarSalario(int pct, int aumentoId, ArrayList<Funcionario> funcionarios){
        if (funcionarios.stream().anyMatch(x -> x.getId() == aumentoId)){
            funcionarios.stream()
                    .filter(f -> f.getId() == aumentoId)
                    .findFirst()
                    .ifPresent(f -> f.aumentoSalario(pct));
        } else {
            System.out.println("Id não encontrado");
        }
    }
}
