package UserDao;

import com.entity.AdminEntity;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;


public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


    @Override
    //private HibernateTemplate hibernateTemplate;
    //    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//        this.hibernateTemplate = hibernateTemplate;
//    }

    @SuppressWarnings("all")
    public AdminEntity loginUser(AdminEntity user) {
        //HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<AdminEntity> list = (List<AdminEntity>) this.getHibernateTemplate().
                find("from AdminEntity where userName=?0 and password=?1", user.getUserName(), user.getPassword());
        if (list.size() != 0 && list != null) {
            AdminEntity u = list.get(0);
            return u;
        } else {
            return null;
        }


    }


}
