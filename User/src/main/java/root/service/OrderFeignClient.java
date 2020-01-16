package root.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import root.entity.Order;

import java.util.List;

@FeignClient("order")
public interface OrderFeignClient {

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public List<Order> findByUserId(@PathVariable Long userId);
}
