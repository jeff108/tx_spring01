package cn.tx.demo3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public class CollectionBean {

    // 数组
    private String [] strs;
    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
    }

    private Map<String,String> map;
    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    private Properties properties;
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "strs=" + Arrays.toString(strs) +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
