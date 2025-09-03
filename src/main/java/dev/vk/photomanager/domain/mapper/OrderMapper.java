package dev.vk.photomanager.domain.mapper;

import dev.vk.photomanager.domain.entity.Order;
import dev.vk.photomanager.entity.RestOrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface OrderMapper {

    Order toOrder(RestOrderDto orderDto);
}
