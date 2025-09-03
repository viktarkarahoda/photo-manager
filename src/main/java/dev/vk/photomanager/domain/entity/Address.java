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
public class Address implements Serializable {

    private UUID id;
    private String index;
    private String city;
    private String region;
    private String street;
    private String building;
    private String apartment;
    private List<Modification> modifications;
}
