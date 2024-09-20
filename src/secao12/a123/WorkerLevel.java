package secao12.a123;

public enum WorkerLevel {
    JUNIOR(1),
    MID_LEVEL(2),
    SENIOR(3);

    private int valor;

    WorkerLevel(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
