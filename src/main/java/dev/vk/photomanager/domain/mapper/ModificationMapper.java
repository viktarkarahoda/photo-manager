package dev.vk.photomanager.domain.mapper;

import dev.vk.photomanager.domain.entity.Modification;
import dev.vk.photomanager.entity.RestModificationDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface ModificationMapper {

    Modification toModification(RestModificationDto modificationDto);
}
