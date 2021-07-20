package top.yewenxue.springcloud.service.impl;

import org.springframework.stereotype.Service;
import top.yewenxue.springcloud.dao.PaymentDao;
import top.yewenxue.springcloud.entities.Payment;
import top.yewenxue.springcloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}