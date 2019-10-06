package part02property;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import part00componetregister.Person;
import part01lifecycle.BeanAnnotationLifeCycle;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 7:09
 * @Author: code1990
 * @Description:
 */
public class PropertyTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyConfig.class);

    @Test
    public void testPropertyValue(){
        printBeans(applicationContext);
        System.out.println("=============");

        PropertyEntity entity = (PropertyEntity) applicationContext.getBean("getPropertyEntity");
        System.out.println(entity);


        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("PropertyEntity.nickName");
        System.out.println(property);
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
