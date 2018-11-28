package service;

import UserDao.MovieDao;
import com.entity.MovieEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class MovieService {
    private MovieDao movieDao;

    public void setMovieDao(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Transactional
    public void add(MovieEntity movieEntity) {
        movieDao.add(movieEntity);
    }

    public List<MovieEntity> findAll() {
        return movieDao.findAll();

    }

    public MovieEntity findOne(int mid) {
        return movieDao.findOne(mid);
    }

    public void delete(MovieEntity m) {
        movieDao.delete(m);
    }

    public void update(MovieEntity movieEntity) {
        movieDao.update(movieEntity);
    }
}
