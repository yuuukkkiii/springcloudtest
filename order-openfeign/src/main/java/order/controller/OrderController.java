package order.controller;


import order.feign.ProductFeignService;
import order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
//    注入之前记得在启动类上开启feignclient
    @Autowired
    StockFeignService stockFeignService;

    @Autowired
    ProductFeignService productFeignService;


    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        String msg=stockFeignService.reduct();
        String result= productFeignService.get(1);
        return "Hello Feign" +msg+"\n"+result;
    }

}
