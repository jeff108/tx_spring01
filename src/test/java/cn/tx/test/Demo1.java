package cn.tx.test;

import cn.tx.service.UserService;
import cn.tx.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public class Demo1 {

    /**
     * 使用原来的方式
     */
    @Test
    public void run1(){
        // new 对象的方式 对象的创建权利 由我控制
        UserService userService = new UserServiceImpl();
        // 调用方法
        userService.hello();
    }

    /**
     * 使用IOC的方式
     * DI 依赖注入
     */
    @Test
    public void run2(){
        // 先创建Spring的IOC的工厂，加载src目录下的配置文件，把配置文件中类创建成对象，存储到IOC容器中。
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取对象就OK。  Map<"us",对象>
        UserService us = (UserService) ac.getBean("us");
        // 调用对象的方法即可。
        us.hello();
    }

    /**
     * 使用IOC的方式
     * 加载c盘配置文件
     */
    @Test
    public void run3(){
        // 先创建Spring的IOC的工厂，加载src目录下的配置文件，把配置文件中类创建成对象，存储到IOC容器中。
        ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\demo2\\applicationContext.xml");
        // 从容器中获取对象就OK。  Map<"us",对象>
        UserService us = (UserService) ac.getBean("us");
        // 调用对象的方法即可。
        us.hello();
    }

    /**
     * 测试对象的生命周期
     * DI 依赖注入
     */
    @Test
    public void run4(){
        // 先创建Spring的IOC的工厂，加载src目录下的配置文件，把配置文件中类创建成对象，存储到IOC容器中。
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("======================================");
        // 从容器中获取对象就OK。
        UserService us = (UserService) ac.getBean("us");
        // 调用对象的方法即可。
        us.hello();
    }

}
