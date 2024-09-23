package secao12.a123;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //COLETA DE DADOS
        System.out.println("Qual o departamento do trabalhador?");
        Departament dp = new Departament(sc.nextLine());
        System.out.println("Digite o nome do trabalhador: ");
        String name = sc.nextLine();
        System.out.println("Digite o nivel do trabalhador sabendo que 1.JUNIOR " +
                            "2. MID_LEVEL 3.SENIOR: ");
        int nivel = sc.nextInt();
        System.out.println("Qual o salario base do trabalhador: ");
        double salary = sc.nextDouble();

        //CRIANDO WORKER
        Worker worker = new Worker(name,createWorkerLevelByNumber(nivel), salary);
        worker.setDepartament(dp);

        System.out.println("Quantos contratos a ser adicionado?");
        int qntdContratos = sc.nextInt();
        sc.nextLine();

        criarContratos(qntdContratos, worker);

        //CONSULTANDO
        System.out.println("Qual o ano que dejesa consultar o salario?");
        int anoConsulta = sc.nextInt();
        System.out.println("Qual o mês do ano "+anoConsulta+" deseja consultar?");
        int mesConsulta = sc.nextInt();

        System.out.println(worker.income(anoConsulta, mesConsulta));
    }


    public static WorkerLevel createWorkerLevelByNumber(int nivel){
        switch (nivel){
            case 1: return WorkerLevel.JUNIOR;
            case 2: return WorkerLevel.MID_LEVEL;
            case 3: return WorkerLevel.SENIOR;
            default: return null;
        }
    }
    public static void criarContratos(int qntdContratos, Worker worker){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < qntdContratos; i++){
            System.out.println("Digite o mês e ano do contrato no formato (MM/yyyy):");
            String dataInput = "01/"+ sc.nextLine();

            DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataInput, frmt1);


            System.out.println("Digite o valor por hora do contrato:");
            double valuePerHour = sc.nextDouble();
            System.out.println("Quantas horas de trabalho tem o contrato?");
            int hours = sc.nextInt();

            HourContrat contrat = new HourContrat(data, valuePerHour, hours);
            worker.addContract(contrat);
            System.out.println(contrat.toString());
        }
    }
}
