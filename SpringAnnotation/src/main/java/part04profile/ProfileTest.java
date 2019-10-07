package part04profile;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 10:49
 * @Author: code1990
 * @Description:
 */
public class ProfileTest {
    //1、使用命令行动态参数: 在虚拟机参数位置加载 -Dspring.profiles.active=test
    //2、代码的方式激活某种环境；
    @Test
    public void test01(){
        //1、创建一个applicationContext
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        //2、设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("dev");
        //3、注册主配置类
        applicationContext.register(ProfileConfig.class);
        //4、启动刷新容器
        applicationContext.refresh();


        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String string : namesForType) {
            System.out.println(string);
        }

        NoProfileEntity bean = applicationContext.getBean(NoProfileEntity.class);
        System.out.println(bean);
        applicationContext.close();
    }
}
