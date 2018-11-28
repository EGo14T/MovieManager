package service;

import UserDao.AdminDao;
import com.entity.AdminEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class AdminService {
    private AdminDao adminDao;

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    public List<AdminEntity> findAll() {
        return adminDao.findAll();

    }

    public AdminEntity findOne(int mid) {
        return adminDao.findOne(mid);
    }

    public void update(AdminEntity adminEntity) {
        adminDao.update(adminEntity);
    }

    public void updatePassword(AdminEntity adminEntity) {
        adminDao.update(adminEntity);
    }
}
