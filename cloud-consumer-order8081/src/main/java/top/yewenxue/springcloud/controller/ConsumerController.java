package top.yewenxue.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.yewenxue.springcloud.entities.CommonResult;
import top.yewenxue.springcloud.entities.Payment;

@RestController
@Slf4j
public class ConsumerController
{

    //订单服务访问地址不能写死
    //public static final String PaymentSrv_URL = "http://localhost:8001";
    // 通过在eureka上注册过的微服务名称调用
    public static final String PAYMENT_SRV = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create") //客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
    public CommonResult create(Payment payment)
    {
        log.info("create...consumer");
        return restTemplate.postForObject(PAYMENT_SRV + "/payment/create",payment,CommonResult.class);//发一个post请求
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id)
    {
        log.info("get...consumer");
        /*
        *
        * */
        //return restTemplate.getForObject(PAYMENT_SRV + "/payment/get/"+id, CommonResult.class, id);
        return restTemplate.getForObject(PAYMENT_SRV + "/payment/get/"+id, CommonResult.class);
    }
}