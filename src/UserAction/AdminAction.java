package UserAction;

import com.entity.AdminEntity;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import service.AdminService;

import java.util.List;

public class AdminAction extends ActionSupport implements ModelDriven {

    private AdminService adminService;
    private AdminEntity adminEntity = new AdminEntity();

    public Object getModel() {
        return adminEntity;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    public String listAdmin() {
        List<AdminEntity> list = adminService.findAll();
        //放到域对象
        ServletActionContext.getRequest().setAttribute("list", list);

        return "list";
    }

    public String showAdmin() {
        //使用模型驱动或许表单内movieId的值
        int mid = adminEntity.getId();
        //查询id 调用方法进行修改操作
        //根据id进行查询
        AdminEntity a = adminService.findOne(mid);
        //放到域对象里
        ServletActionContext.getRequest().setAttribute("adminEntity", a);
        return "showAdmin";
    }

    public String update() {
        adminService.update(adminEntity);
        return "update";
    }

    public String editPassword() {
        //使用模型驱动或许表单内movieId的值
        int mid = adminEntity.getId();
        //查询id 调用方法进行修改操作
        //根据id进行查询
        AdminEntity a = adminService.findOne(mid);
        //放到域对象里
        ServletActionContext.getRequest().setAttribute("adminEntity", a);
        return "editPassword";
    }


    public String updatePassword() {
        adminService.update(adminEntity);
        return "updatePassword";
    }


}
