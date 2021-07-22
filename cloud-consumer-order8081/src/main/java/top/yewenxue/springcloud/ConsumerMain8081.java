package top.yewenxue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import top.yewenxue.myrule.MySelfRule2;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule2.class)

public class ConsumerMain8081 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain8081.class,args);
    }
}
