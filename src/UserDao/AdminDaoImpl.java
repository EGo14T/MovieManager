package UserDao;

import com.entity.AdminEntity;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {


    public List<AdminEntity> findAll() {
        return (List<AdminEntity>) this.getHibernateTemplate().find("from AdminEntity ");
    }


    public AdminEntity findOne(int mid) {
        return this.getHibernateTemplate().get(AdminEntity.class, mid);
    }


    public void update(AdminEntity adminEntity) {
        this.getHibernateTemplate().update(adminEntity);
    }


    public void updatePassword(AdminEntity adminEntity) {
        this.getHibernateTemplate().update(adminEntity);
    }
}
