import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 16:11
 * @Author: code1990
 * @Description:
 */
public class MainTest {
    @Test
    public void testInfo() throws IOException {
        String[] array = {
            "00spring容器-1组件注册.md",
            "00spring容器-2生命周期.md",
            "00spring容器-3属性赋值.md",
            "00spring容器-4属性赋值.md",
            "00spring容器-5自动装配.md",
            "00spring容器-6AOP原理.md",
            "00spring容器-7声明式事务.md"
        };
        String path = "F:\\github\\reading\\javaee\\09.spring注解\\";
        for(String str:array){
            System.out.println(path+str);
            new File(path+str).createNewFile();
        }
    }

    @Test
    public void testInfo1233(){
        String str = "F:\\尚硅谷Spring注解驱动开发\\Spring注解驱动开发\\视频";
        for(File file:new File(str).listFiles()){
            System.out.println(file.getName());
        }
    }
}
