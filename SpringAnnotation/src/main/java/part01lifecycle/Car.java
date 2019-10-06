package part01lifecycle;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-06 21:31
 * @Author: code1990
 * @Description:
 */
public class Car {

    public Car() {
        System.out.println("car constructor");
    }
    public void init(){
        System.out.println("init method");
    }
    public void destroy(){
        System.out.println("destroy method");
    }

}
