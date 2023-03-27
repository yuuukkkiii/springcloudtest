package order.interceptor.feign;



import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//feign拦截器配置

public class CustomFeignInterceptor implements RequestInterceptor {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void apply(RequestTemplate requestTemplate) {
//        todo
        requestTemplate.header("xxx", "xxx");
        requestTemplate.query("id", "111");
        requestTemplate.uri("/9");
        logger.info("feign拦截器，拦截中");
    }
}
