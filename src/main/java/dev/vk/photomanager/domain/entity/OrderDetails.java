package dev.vk.photomanager.domain.entity;

import dev.vk.photomanager.domain.enums.PaymentType;
import java.io.Serializable;
import java.time.LocalDateTime;
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
public class OrderDetails implements Serializable {

    private UUID id;
    private UUID orderId;
    private Address shippingAddress;
    private Double shippingCosts;
    private LocalDateTime createdAt;
    private LocalDateTime plannedDate;
    private LocalDateTime paymentDate;
    private PaymentType paymentType;
    private Status status;
    private List<Modification> modifications;

    public enum Status {
        NEW,
        IN_PROGRESS,
        COMPLETED,
        CLOSED,
    }
}
