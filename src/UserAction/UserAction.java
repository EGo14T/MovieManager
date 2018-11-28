package UserAction;

import com.entity.AdminEntity;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import service.Userservice;

import javax.servlet.http.HttpServletRequest;

public class UserAction extends ActionSupport {


    private Userservice userService;

    public void setUserservice(Userservice userservice) {
        this.userService = userservice;
    }

    //登录的用户名和密码
    private String username;
    private String password;
    private Integer id;
    private String adminName;

    //get set
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //登录的Action的实现方法
    public String login() {
        AdminEntity user = new AdminEntity();
        user.setUserName(username);
        user.setPassword(password);
        user.setId(id);
        user.setAdminName(adminName);
        AdminEntity userExist = userService.login(user);

        if (userExist != null) {//成功
            HttpServletRequest request = ServletActionContext.getRequest();
            request.getSession().setAttribute("user", userExist);
            return "login";
        } else {//失败
            return "error";
        }
    }

}
