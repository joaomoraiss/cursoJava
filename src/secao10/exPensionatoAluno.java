package secao10;

public class exPensionatoAluno {
    int quarto;
    String nome, email;

    public exPensionatoAluno(int quarto, String nome, String email) {
        this.quarto = quarto;
        this.nome = nome;
        this.email = email;
    }

    public String toString(){
        return nome+", "+email;
    }
}
