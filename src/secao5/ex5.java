package secao5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map <Integer, Double> menu = new HashMap<>();
        menu.put(1, 4.0);
        menu.put(2, 4.5);
        menu.put(3, 5.0);
        menu.put(4, 2.0);
        menu.put(5, 1.5);
        int codigo, qntd;
        double total;
        System.out.println("1. Cachorro Quente  R$4\n" +
                "2. X-Salada  R$4.5\n" +
                "3. X-Bacon   R$5\n" +
                "4. Torrada Simples   R$2\n" +
                "5. Refrigerante   R$1.5\n");
        System.out.println("Digite o codigo e a quantidade desejada:");
        codigo = input.nextInt();
        qntd = input.nextInt();
        if (menu.containsKey(codigo)){
            total = menu.get(codigo) * qntd;
            System.out.println("Total: R$"+total);
        } else System.out.println("Codigo invalido");

    }
}
