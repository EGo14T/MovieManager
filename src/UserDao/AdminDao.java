package UserDao;

import com.entity.AdminEntity;

import java.util.List;

public interface AdminDao {
    List<AdminEntity> findAll();

    AdminEntity findOne(int mid);

    void update(AdminEntity adminEntity);

    void updatePassword(AdminEntity adminEntity);
}
