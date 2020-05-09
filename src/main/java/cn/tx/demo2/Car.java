package cn.tx.demo2;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public class Car {

    // 名称
    private String cname;
    // 金额
    private Double money;

    public Car(String cname, Double money) {
        this.cname = cname;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                ", money=" + money +
                '}';
    }

}
