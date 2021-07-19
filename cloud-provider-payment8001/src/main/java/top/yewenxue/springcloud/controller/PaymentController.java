package top.yewenxue.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.yewenxue.springcloud.entities.CommonResult;
import top.yewenxue.springcloud.entities.Payment;
import top.yewenxue.springcloud.service.PaymentService;

import javax.annotation.Resource;

@RestController
@Slf4j //打印日志
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create( @RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入操作的返回结果是:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功", result);
        } else {
            return new CommonResult<>(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("按照id查询的结果为:"+result);
        if (result != null) {
            return new CommonResult<>(200,"查询成功",result);
        } else {
            return new CommonResult<>(444,"查询失败",null);
        }
    }

}
