package UserDao;

import com.entity.MovieEntity;

import java.util.List;

public interface MovieDao {
    void add(MovieEntity movieEntity);

    List<MovieEntity> findAll();

    MovieEntity findOne(int mid);

    void delete(MovieEntity m);

    void update(MovieEntity movieEntity);
}
