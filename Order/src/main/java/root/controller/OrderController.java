package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import root.entity.Order;
import root.service.IOrderService;

import java.util.List;

@RestController
public class OrderController {

   /* @Autowired
    private RestTemplate restTemplate;*/

    /*@GetMapping("/")
    public Object getInfor(){
        return this.restTemplate.getForObject("http://user/",String.class);
    }*/


    @Autowired
    private IOrderService orderService;

    @RequestMapping(value = "/findOrder",method = RequestMethod.GET)
    public List<Order> findOrder(){return orderService.findOrder();}

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public List<Order> findByUserId(@PathVariable Long userId){ return orderService.findByUserId(userId);}
}
