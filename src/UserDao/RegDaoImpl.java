package UserDao;

import com.entity.AdminEntity;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class RegDaoImpl extends HibernateDaoSupport implements RegDao {

    public void add(AdminEntity reg) {
        this.getHibernateTemplate().save(reg);
    }

}
