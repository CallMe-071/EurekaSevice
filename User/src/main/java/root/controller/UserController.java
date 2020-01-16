package root.controller;


/*
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import root.entity.Information;
import root.entity.User;
import root.service.IOrderService;
import root.service.IUserService;
import root.service.OrderFeignClient;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private IOrderService orderService;

    @Autowired
    private OrderFeignClient orderFeignClient;

/*    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient discoveryClient;


    @GetMapping("/getUrl")
    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("USER", false);
        return instance.getHomePageUrl();
    }*/



    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List findAll(){
        List<User> userList = userService.findAll();
        for (User user:userList
             ) {
            Long id = user.getId();
            user.setOrder(orderFeignClient.findByUserId(id));
        }
        return userList;
    }
}
