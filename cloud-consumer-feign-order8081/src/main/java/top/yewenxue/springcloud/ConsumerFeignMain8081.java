package top.yewenxue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignMain8081 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMain8081.class,args);
    }
}
