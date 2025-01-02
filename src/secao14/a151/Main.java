package secao14.a151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Account Data:");
        System.out.println("Number:");
        int num = s.nextInt();
        s.nextLine();
        System.out.println("Holder:");
        String holder = s.nextLine();
        System.out.println("Initial Balance:");
        Double iB = s.nextDouble();
        System.out.println("Withdraw Limit:");
        Double wL = s.nextDouble();

        Account ac = new Account(num, holder, iB, wL);

        System.out.println("Enter amount for withdraw:");
        double aW = s.nextDouble();
        try {
            ac.withdraw(aW);
            System.out.println("New balance: "+ac.balance);
        } catch (Exception e){
            System.out.println("Withdraw error: The amount exceeds withdraw limit");
        }

    }
}
