package top.yewenxue.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.yewenxue.springcloud.entities.Payment;

@Mapper  //import org.apache.ibatis.annotations.Mapper;
public interface PaymentDao {
    public int create(Payment payment);

    //@Param注解的作用是给参数命名，参数命名后就能根据名字得到参数值，正确的将参数传入sql语句中
    public Payment getPaymentById(@Param("id") Long id);
}