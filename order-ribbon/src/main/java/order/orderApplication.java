package order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import ribbon.RibbonRandomRuleConfig;

@SpringBootApplication
//@RibbonClients(value = {
//        @RibbonClient(name="stock-service",configuration = RibbonRandomRuleConfig.class)
//})
public class orderApplication {
    public static void main(String[] args) {
        SpringApplication.run(orderApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate=builder.build();
        return restTemplate;
    }
}
