package secao12.a126;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public double subTotal(){
        return price * quantity;
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.price = product.getPrice();
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(product.getName()+", $"+price+", "+
                "Quantity: "+quantity+", " +"Subtotal: $"+subTotal());
        return str.toString();
    }
}
