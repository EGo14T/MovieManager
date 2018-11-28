package service;

import UserDao.RegDao;
import com.entity.AdminEntity;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RegisterService {
    private RegDao regDao;

    public void setRegDao(RegDao regDao) {
        this.regDao = regDao;
    }

    public void add(AdminEntity reg) {
        regDao.add(reg);
    }
}
