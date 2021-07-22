package top.yewenxue.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule2 {
    @Bean
    public IRule MySelfRule() {
        return new RandomRule();
    }
}
