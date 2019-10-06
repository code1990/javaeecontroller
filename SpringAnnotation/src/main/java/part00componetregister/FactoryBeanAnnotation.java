package part00componetregister;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 21:04
 * @Author: code1990
 * @Description:
 */
@Configuration
public class FactoryBeanAnnotation {

    @Bean("factoryBeanEntity")
    public FactoryBeanEntity getFactoryBean(){
        return new FactoryBeanEntity();
    }
}
