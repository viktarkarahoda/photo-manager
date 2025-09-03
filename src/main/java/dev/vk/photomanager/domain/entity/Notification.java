package dev.vk.photomanager.domain.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification implements Serializable {

    private UUID id;
    private UUID orderId;
    private String message;
    private LocalDateTime date;
    private State state;
    private Type type;

    public enum State {
        NEW,
        ACTIVE,
        INACTIVE,
        VIEWED,
    }

    public enum Type {
        ORDER,
        ACCOUNT,
        PAYMENT,
        INFO,
    }
}
