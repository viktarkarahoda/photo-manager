package dev.vk.photomanager.in.mapper;

import dev.vk.photomanager.domain.entity.Account;
import dev.vk.photomanager.entity.RestAccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface RestAccountMapper {

    RestAccountDto toAccountDto(Account account);
}
