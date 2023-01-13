package bg.blubito.mapstructproblems.stackOverflowSolution;

import java.math.BigDecimal;

public class OrderItemDTO {
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private OrderDTO order;

    public OrderItemDTO(String name, BigDecimal price, Integer quantity, OrderDTO order) {
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

    public OrderDTO getOrder() {
        return order;
    }

    public void setOrder(OrderDTO order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderItemDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", order=" + order +
                '}';
    }
}
