package com.enttax.dao;

import com.enttax.model.Bill;
import com.enttax.util.tools.ToolRandoms;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.List;

/**
 * Created by brainy on 17-4-27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class BillMapperTest {

    @Autowired
    private BillMapper billMapper;

    /**
     * 测试查询数据
     */
    @Test
    public void selectAllTest() {

        //查询  Bill
        List<Bill> bills = billMapper.selectAll();

        //断言不为空
        Assert.assertNotNull(bills);
    }

    /**
     * 测试插入一条 数据
     */
    @Test
    public void insertTest() {

        //生成数据
        Bill bill = new Bill();
        bill.setBId(ToolRandoms.randomBillId());
        bill.setBType("进项数据");
        bill.setBName("猪肉");
        bill.setBMonth(1);
        bill.setBPrice(ToolRandoms.random.nextDouble());
        bill.setBUpdateTime(new Date());
        bill.setBMark(1);

        //插入数据
        int resultCode = billMapper.insert(bill);

        //断言 影响一行记录
        Assert.assertEquals(resultCode, 1);
    }
}