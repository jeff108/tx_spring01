package cn.tx.test;

import cn.tx.dao.OrderDao;
import cn.tx.demo2.Car;
import cn.tx.demo3.CollectionBean;
import cn.tx.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public class Demo3 {

    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService os = (OrderService) ac.getBean("os");
        os.saveOrder();
    }

    @Test
    public void run2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao od = (OrderDao) ac.getBean("od");
        od.saveOrder();
    }

    @Test
    public void run3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) ac.getBean("car");
        System.out.println(car);
    }

    @Test
    public void run4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean bean = (CollectionBean) ac.getBean("collectionBean");
        System.out.println(bean);
    }

    /**
     * 加载多个配置文件
     */
    @Test
    public void run5(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext_list.xml");
        CollectionBean bean = (CollectionBean) ac.getBean("collectionBean");
        System.out.println(bean);
    }

}
