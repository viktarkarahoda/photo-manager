package dev.vk.photomanager.in.mapper;

import dev.vk.photomanager.domain.entity.ContactInfo;
import dev.vk.photomanager.entity.RestContactInfoDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface RestContactInfoMapper {

    RestContactInfoDto toContactInfoDto(ContactInfo contactInfo);

}
