package root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.entity.Order;
import root.repository.OrderMapper;

import java.util.List;

@Service
public class OrderServiceImp implements IOrderService {


    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findOrder(){ return orderMapper.findOrder();}

    @Override
    public List<Order> findByUserId(Long userId){ return orderMapper.findByUserId(userId);}
}
