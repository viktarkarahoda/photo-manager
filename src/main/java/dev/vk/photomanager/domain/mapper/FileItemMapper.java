package dev.vk.photomanager.domain.mapper;

import dev.vk.photomanager.domain.entity.FileItem;
import dev.vk.photomanager.entity.RestFileItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface FileItemMapper {

    FileItem toFileItem(RestFileItemDto fileItemDto);
}
