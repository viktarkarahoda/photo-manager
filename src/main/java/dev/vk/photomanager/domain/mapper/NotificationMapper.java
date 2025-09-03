package dev.vk.photomanager.domain.mapper;

import dev.vk.photomanager.domain.entity.Notification;
import dev.vk.photomanager.entity.RestNotificationDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface NotificationMapper {

    Notification toNotification(RestNotificationDto notificationDto);
}
