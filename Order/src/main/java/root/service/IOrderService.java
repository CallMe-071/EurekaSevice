package root.service;

import root.entity.Order;

import java.util.List;

public interface IOrderService {
    List<Order> findOrder();

    List<Order> findByUserId(Long userId);
}
