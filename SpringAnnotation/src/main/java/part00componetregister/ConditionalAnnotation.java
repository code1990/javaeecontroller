package part00componetregister;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 17:54
 * @Author: code1990
 * @Description:
 */
//类中组件统一设置。满足当前条件，这个类中配置的所有bean注册才能生效；
@Conditional({WindowsCondition.class})
@Configuration
public class ConditionalAnnotation {
    /**
     * @Conditional({Condition}) ：
     * 按照一定的条件进行判断，满足条件给容器中注册bean
     * 满足给定条件的类或者方法才能往ioc容器中添加
     *
     * 如果系统是windows，给容器中注册("bill")
     * 如果是linux系统，给容器中注册("linus")
     */
//    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        return new Person("Bill Gates",62);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linus")
    public Person person02(){
        return new Person("linus", 48);
    }
}
