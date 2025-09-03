package dev.vk.photomanager.in.mapper;

import dev.vk.photomanager.domain.entity.Comment;
import dev.vk.photomanager.entity.RestCommentDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface RestCommentMapper {

    RestCommentDto toCommentDto(Comment comment);

}
