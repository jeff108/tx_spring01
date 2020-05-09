package cn.tx.service;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("UserServiceImpl对象被创建了...");
    }

    public void hello() {
        System.out.println("Hello IOC!!");
    }

    // 初始化
    public void init(){
        System.out.println("对象创建完成，进行初始化操作...");
    }

    // 销毁方法
    public void destory(){
        System.out.println("销毁...");
    }


}
