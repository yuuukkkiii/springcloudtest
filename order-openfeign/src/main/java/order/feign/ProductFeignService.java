package order.feign;

import order.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//在下面加上configuration，可以局部配置日志
@FeignClient(name = "product-service",path = "/product",configuration = FeignConfig.class)
public interface ProductFeignService {

    @RequestMapping("/{id}")
//    在feign里Pathvariable的参数必须显性给出
    public String get(@PathVariable("id") Integer id);
}
