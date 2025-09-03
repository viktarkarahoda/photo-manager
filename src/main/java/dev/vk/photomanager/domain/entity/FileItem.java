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
public class FileItem implements Serializable {

    private UUID id;
    private UUID orderItemId;
    private String link;
    private byte[] preview;
    private List<Modification> modifications;
}
