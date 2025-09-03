package dev.vk.photomanager.in.mapper;

import dev.vk.photomanager.domain.entity.OrderDetails;
import dev.vk.photomanager.entity.RestOrderDetailsDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface RestOrderDetailsMapper {
    RestOrderDetailsDto toOrderDetailsDto(OrderDetails orderDetails);
}
