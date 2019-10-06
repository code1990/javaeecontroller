package part02property;

import org.springframework.beans.factory.annotation.Value;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 6:58
 * @Author: code1990
 * @Description:
 */
public class PropertyEntity {

    //使用@Value赋值；
    //1、基本数值
    //2、可以写SpEL； #{}
    //3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）

    @Value("zhangsan")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${PropertyEntity.nickName}")
    private String nickName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "PropertyEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
