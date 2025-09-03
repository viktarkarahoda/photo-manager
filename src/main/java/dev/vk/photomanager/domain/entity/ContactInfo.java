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
public class ContactInfo implements Serializable {

    private UUID id;
    private List<String> phone;
    private String email;
    private List<Address> addresses;
    private List<Modification> modifications;
}
