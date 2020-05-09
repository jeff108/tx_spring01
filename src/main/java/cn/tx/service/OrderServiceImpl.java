package cn.tx.service;

import cn.tx.dao.OrderDao;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public class OrderServiceImpl implements OrderService {

    // 编写成员属性，一定需要提供该属性的set方法
    private OrderDao orderDao;
    // 一定需要提供该属性的set方法，IOC容器底层就通过属性的set方法方式注入值
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    // 消息
    private String msg;
    // 年龄
    private int age;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saveOrder() {
        System.out.println("业务层：保存订单..."+msg+" - "+age);
        // 调用
        orderDao.saveOrder();
    }

}
