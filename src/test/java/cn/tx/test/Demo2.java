package cn.tx.test;

import cn.tx.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 *
 * 测试实例化bean对象的三种方式
 *
 */
public class Demo2 {

    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us = (UserService) ac.getBean("us");
        us.hello();
    }

}
