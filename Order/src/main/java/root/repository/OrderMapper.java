package root.repository;

import org.apache.ibatis.annotations.Mapper;
import root.entity.Order;


import java.util.List;

@Mapper
public interface OrderMapper {

    List<Order> findOrder();

    List<Order> findByUserId(Long userId);
}
