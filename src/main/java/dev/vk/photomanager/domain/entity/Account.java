package dev.vk.photomanager.domain.entity;

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
public class Account implements Serializable {

    private UUID id;
    private Long number;
    private ContactInfo contactInfo;
    private String name;
    private LocalDateTime createdAt;
    private List<Modification> modifications;
    private List<Notification> notifications;
    private Role role;
    private List<Comment> comments;

    public enum Role {
        ADMIN,
        CLIENT,
        OPERATOR
    }
}
