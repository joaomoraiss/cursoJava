package secao12.a126;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private ArrayList<OrderItem> items = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        if(items.stream().anyMatch(x -> x == item))items.remove(item);
        else System.out.println("Item não foi achado no pedido");
    }

    public String toString(){
        StringBuilder str2 = new StringBuilder();
        double totalPrice = 0;
        for(OrderItem item : items){
            totalPrice += item.getPrice();
            str2.append(item.toString()+"\n");
        }
        str2.append("Total price: $"+totalPrice);
        StringBuilder str = new StringBuilder();
        str.append("ORDER SUMMARY:"+"\n"+
                    "Order moment: "+moment.format(dtf)+"\n"+
                    "Order status: "+status+"\n"+
                    "Client: "+client.toString()+"\n"+
                    "Order items: "+"\n"+ str2.toString());
        return str.toString();

    }
}
