package dev.vk.photomanager.domain.service;

import dev.vk.photomanager.domain.entity.Order;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    public Order getOrder(UUID orderId) {
        return null;
    }

    public Order modifyOrder(Order orderToUpdate) {
        return null;
    }

    public Order createOrder(Order newOrder) {
        System.out.println(newOrder.toString());
        return newOrder;
    }
}
