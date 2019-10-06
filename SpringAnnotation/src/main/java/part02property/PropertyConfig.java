package part02property;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 7:04
 * @Author: code1990
 * @Description:
 */
/*指定配置文件的位置 可以使用多个@PropertySource
 * 或者使用@PropertySources指定多个PropertySource
 * 或者一个PropertySource指定多个value数组值
 * */
@PropertySource(value={"classpath:/propertyEntity.properties"})
@Configuration
public class PropertyConfig {
    @Bean("getPropertyEntity")
    public PropertyEntity getPropertyEntity(){
        return new PropertyEntity();
    }
}
