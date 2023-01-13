package bg.blubito.mapstructproblems.stackOverflowSolution;

import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
    private Long id;
    private String sender;
    private String receiver;
    private List<OrderItemDTO> orderItemList;

    public OrderDTO(Long id, String sender, String receiver) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.orderItemList = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public List<OrderItemDTO> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItemDTO> orderItemList) {
        this.orderItemList = orderItemList;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", orderItemList=" + (orderItemList.isEmpty()? "[]" : "[someOrderItems]") +
                '}';
    }

    public String specialToString() {
        return "Order{" +
                "id=" + id +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", orderItemList=" + orderItemList +
                '}';
    }
}
