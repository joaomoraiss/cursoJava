package secao12.a126;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client c1 = criarCliente();
        Order order1 = createOrder(c1);
        System.out.println(order1);
    }
    public static Client criarCliente(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: "+"\n"+"Name:");
        String clientName = sc.nextLine();
        System.out.println("Email: ");
        String clientEmail = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        LocalDate dateBirth = LocalDate.parse(birthDate, dtf);
        Client client = new Client(clientName, clientEmail, dateBirth);
        System.out.println(client.toString());
        return client;
    }
    public static OrderStatus createOrderStatus(int nivel){
        switch (nivel){
            case 0: return OrderStatus.PENDING_PAYMENT;
            case 1: return OrderStatus.PROCESSING;
            case 2: return OrderStatus.SHIPPED;
            case 3: return OrderStatus.DELIVERED;
            default: return null;
        }
    }
    public static Order createOrder(Client client){
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter order data: "+"\n"+"Status: PENDING_PAYMENT(0),\n" +
                "    PROCESSING(1),\n" +
                "    SHIPPED(2),\n" +
                "    DELIVERED(3)"+"\n");
        int status = sc.nextInt();
        System.out.println("How many items to this order?");
        int qntdItems = sc.nextInt();

        LocalDateTime moment = LocalDateTime.now();
        Order order = new Order(moment, createOrderStatus(status),client);
        for (int i = 1; i <= qntdItems; i ++){

            System.out.println("Enter #"+i+" item data:");
            sc.nextLine();
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            Double procutPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int qntd = sc.nextInt();

            Product product = new Product(productName, procutPrice);
            OrderItem orderItem = new OrderItem(qntd, product);
            order.addItem(orderItem);
        }
        return order;
    }
}
