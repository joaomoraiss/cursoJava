package secao12;

import java.util.Date;

public class a120 {
    public static void main(String[] args) {
        Order order = new Order(140, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
