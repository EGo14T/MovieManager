package UserAction;

import com.entity.MovieEntity;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import service.MovieService;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MovieAction extends ActionSupport implements ModelDriven<MovieEntity> {
    private MovieService movieService;

    private MovieEntity movieEntity = new MovieEntity();

    public MovieEntity getModel() {
        return movieEntity;
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    //上传文件变量
    private File upload;
    //上传文件的名称
    private String uploadFileName;


    //上传变量的生成get set方法
    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String addMovie() throws IOException {

        //判断用户是否需要上传文件
        if (upload != null) {
            //路径变量
            String area = this.movieEntity.getMovieArea();
            String kind = this.movieEntity.getMovieKind();
            //上传代码
            //1在服务器文件夹里创建文件
            File serverFile = new File("E:\\movie" + "/" + area + "/" + kind + "/" + uploadFileName);
            //2把上传文件复制到服务器文件里
            FileUtils.copyFile(upload, serverFile);

            System.out.println("地区" + area);
            System.out.println("种类" + kind);
        }
        movieService.add(movieEntity);
        return "add";
    }

    public String listMovie() {
        List<MovieEntity> list = movieService.findAll();
        //放到域对象
        ServletActionContext.getRequest().setAttribute("list", list);

        return "list";
    }

    public String delMovie() {
        //使用模型驱动或许表单内movieId的值
        int mid = movieEntity.getMovieId();
        //查询id 调用方法进行删除
        //根据id进行查询
        MovieEntity m = movieService.findOne(mid);
        //调用方法进行删除
        if (m != null) {
            movieService.delete(m);
        }

        return "delete";
    }

    public String showMovie() {
        //使用模型驱动或许表单内movieId的值
        int mid = movieEntity.getMovieId();
        //查询id 调用方法进行修改操作
        //根据id进行查询
        MovieEntity m = movieService.findOne(mid);
        //放到域对象里
        ServletActionContext.getRequest().setAttribute("movieEntity", m);
        return "showMovie";
    }

    public String updateMovie() {
        movieService.update(movieEntity);
        return "update";
    }


}
