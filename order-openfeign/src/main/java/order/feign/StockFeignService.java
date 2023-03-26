package order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//name：对应调用的rest接口所对应的服务名
//path指定rest接口所在的StockController指定的@RequestMapping
@FeignClient(name="stock-service",path = "/stock")
public interface StockFeignService {

//    声明需要的rest接口对应的方法
    @RequestMapping("/reduct")
    String reduct();
}
