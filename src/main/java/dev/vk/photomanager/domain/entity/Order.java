package dev.vk.photomanager.domain.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    private UUID id;
    private Long number;
    private UUID accountId;
    private String title;
    private Account client;
    private String description;
    private List<Comment> comments;
    private List<OrderItem> items;
    private Double totalPrice;
    private OrderDetails orderDetails;

    enum Status {
        NEW,
        IN_PROGRESS,
        COMPLETED,
        CLOSED,
    }
}
