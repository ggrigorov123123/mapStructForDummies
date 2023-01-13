package bg.blubito.mapstructproblems.stackOverflowSolution;

import java.math.BigDecimal;

public class OrderItem {
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Order order;

    public OrderItem(String name, BigDecimal price, Integer quantity, Order order) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", order=" + order +
                '}';
    }
}
