package top.yewenxue.springcloud.service;

import org.apache.ibatis.annotations.Param;
import top.yewenxue.springcloud.entities.Payment;

public interface PaymentService
{
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}