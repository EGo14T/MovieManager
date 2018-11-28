package UserDao;

import com.entity.MovieEntity;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class MovieDaoImpl extends HibernateDaoSupport implements MovieDao {

    //添加电影
    public void add(MovieEntity movieEntity) {
        this.getHibernateTemplate().save(movieEntity);
    }

    //电影列表功能
    @SuppressWarnings("all")
    public List<MovieEntity> findAll() {
        return (List<MovieEntity>) this.getHibernateTemplate().find("from MovieEntity ");

    }


    public MovieEntity findOne(int mid) {
        return this.getHibernateTemplate().get(MovieEntity.class, mid);
    }


    public void delete(MovieEntity m) {
        this.getHibernateTemplate().delete(m);
    }


    public void update(MovieEntity movieEntity) {
        this.getHibernateTemplate().update(movieEntity);
    }
}
