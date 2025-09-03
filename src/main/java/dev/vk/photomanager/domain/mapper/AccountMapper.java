package dev.vk.photomanager.domain.mapper;

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
public interface AccountMapper {

    Account toAccount(RestAccountDto accountDto);
}
