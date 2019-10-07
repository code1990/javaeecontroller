package part06transcational;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: javaeecontroller
 * @Date: 2019-10-07 17:09
 * @Author: code1990
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /*一般放在public的service层方法上 同时数据存储引擎为Innodb*/
    @Transactional
    public void insertUser(){
        userDao.insert();
        System.out.println("insert user");
        int i =10/0;
    }
}
