package secao8.ex2;

public class Funcionario {
    String nome;
    Double salarioBruto, tax;

    public double NetSalary(){
        return salarioBruto - tax;
    }

    public void IncreaseSalary(Double percentage){
        salarioBruto = salarioBruto + (percentage *100)/salarioBruto;
    }

    public String toString(){
        return "nome "+nome+
                "Salario bruto "+salarioBruto+
                "tax " + tax;
    }

}
