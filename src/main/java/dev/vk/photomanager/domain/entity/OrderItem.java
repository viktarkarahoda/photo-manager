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
public class OrderItem implements Serializable {

    private UUID id;
    private UUID orderId;
    private String size;
    private Integer count;
    private Double price;
    private List<Comment> comments;
    private List<FileItem> files;
    private LocalDateTime createdAt;
    private List<Modification> modifications;
}
