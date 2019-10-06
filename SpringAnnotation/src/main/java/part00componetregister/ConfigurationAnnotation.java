package part00componetregister;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 16:56
 * @Author: code1990
 * @Description:
 */
//告诉Spring这是一个配置类 配置类==配置文件
@Configuration
public class ConfigurationAnnotation {
    /*给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id*/
    /*如果指定了value值 则id为给定的value值 如下id=person 而不是方法名*/
    @Bean("person")
    public Person person01(){
        return new Person("lisi",20);
    }
}
