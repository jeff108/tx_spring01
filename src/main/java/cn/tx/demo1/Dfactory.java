package cn.tx.demo1;

import cn.tx.service.UserService;
import cn.tx.service.UserServiceImpl;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 *
 * 动态工厂方式
 *
 */
public class Dfactory {

    public UserService createUs(){
        System.out.println("实例化工厂的方式...");
        return new UserServiceImpl();
    }

}
