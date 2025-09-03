package dev.vk.photomanager.in.mapper;

import dev.vk.photomanager.domain.entity.OrderItem;
import dev.vk.photomanager.entity.RestOrderItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface RestOrderItemMapper {

    RestOrderItemDto toRestOrderItem(OrderItem orderItem);
}
