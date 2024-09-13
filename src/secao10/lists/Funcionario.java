package secao10.lists;

public class Funcionario {
    int id;
    String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentoSalario(int porcentagem){
        this.salario += (salario/100) * porcentagem;
    }
    public String toString(){
        return "Nome: "+nome+"\n"+
                "Salario: "+salario+"\n"+
                "Id: "+id+"\n";
    }
}
