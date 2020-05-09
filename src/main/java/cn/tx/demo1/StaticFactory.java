package cn.tx.demo1;

import cn.tx.service.UserService;
import cn.tx.service.UserServiceImpl;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 * 静态工厂方式
 */
public class StaticFactory {

    // 静态工厂方式
    public static UserService createUs(){
        System.out.println("通过静态工厂的方式创建UserServiceImpl对象...");
        // 编写很多业务逻辑 权限校验
        return new UserServiceImpl();
    }

}
