package service;

import UserDao.UserDao;
import com.entity.AdminEntity;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class Userservice {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public AdminEntity login(AdminEntity user) {
        return userDao.loginUser(user);
    }

}
