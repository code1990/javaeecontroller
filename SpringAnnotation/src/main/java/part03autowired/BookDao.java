package part03autowired;

import org.springframework.stereotype.Repository;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 9:19
 * @Author: code1990
 * @Description:
 */
/*注入到容器时候 默认首字母小写*/
@Repository
public class BookDao {

    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "flag=" + flag +
                '}';
    }
}
