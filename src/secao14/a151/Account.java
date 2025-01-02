package secao14.a151;

public class Account {
    private int number;
    String holder;
    double balance;
    double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){

    }
    public void withdraw(double amount)throws Exception{
        if (balance <= 0) throw new Exception("Você não possui saldo na conta");
        if (amount > withdrawLimit) throw new Exception("Valor de saque superior ao limite");

        balance -= amount;
    }
}
