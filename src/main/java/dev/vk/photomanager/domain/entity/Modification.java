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
public class Modification implements Serializable {

    private UUID id;
    private UUID entityId;
    private LocalDateTime date;
    private Type type;
    private Comment comment;

    public enum Type {
        CREATE,
        EDIT,
        DELETE,
        UPDATE
    }
}
