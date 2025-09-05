package dev.vk.photomanager.in.controller;

import static java.util.UUID.fromString;

import dev.vk.photomanager.api.OrderApi;
import dev.vk.photomanager.domain.entity.Order;
import dev.vk.photomanager.domain.mapper.OrderMapper;
import dev.vk.photomanager.domain.service.OrderService;
import dev.vk.photomanager.entity.RestOrderDto;
import dev.vk.photomanager.in.mapper.RestOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController implements OrderApi {

    private final OrderService orderService;
    private final OrderMapper orderMapper;
    private final RestOrderMapper restOrderMapper;

    @Autowired
    public OrderController(OrderService orderService, OrderMapper orderMapper, RestOrderMapper restOrderMapper) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
        this.restOrderMapper = restOrderMapper;
    }

    @Override
    public ResponseEntity<RestOrderDto> getOrder(String orderId) {
        Order order = orderService.getOrder(fromString(orderId));
        RestOrderDto restOrderDto = restOrderMapper.toOrderDto(order);
        return ResponseEntity.ok(restOrderDto);
    }

    @Override
    public ResponseEntity<RestOrderDto> modifyOrder(RestOrderDto orderDto) {
        Order orderToUpdate = orderMapper.toOrder(orderDto);
        Order updatedOrder = orderService.modifyOrder(orderToUpdate);
        RestOrderDto responseOrder = restOrderMapper.toOrderDto(updatedOrder);
        return ResponseEntity.ok(responseOrder);
    }

    @Override
    public ResponseEntity<RestOrderDto> createOrder(RestOrderDto orderDto) {
        Order newOrder = orderMapper.toOrder(orderDto);
        Order order = orderService.createOrder(newOrder);
        RestOrderDto responseOrder = restOrderMapper.toOrderDto(order);
        return ResponseEntity.ok(responseOrder);
    }
}
