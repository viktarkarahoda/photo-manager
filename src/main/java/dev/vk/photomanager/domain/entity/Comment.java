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
public class Comment implements Serializable {

    private UUID id;
    private UUID entityId;
    private String message;
    private LocalDateTime date;
    private Status status;

    public enum Status {
        ACTIVE,
        INACTIVE
    }
}
