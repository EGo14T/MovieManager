package UserAction;

import com.entity.AdminEntity;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import service.RegisterService;

public class RegisterAction extends ActionSupport implements ModelDriven<AdminEntity> {
    private RegisterService registerService;

    private AdminEntity reg = new AdminEntity();

    public AdminEntity getModel() {
        return reg;
    }

    public void setRegisterService(RegisterService registerService) {
        this.registerService = registerService;
    }

    //注册新用户
    public String register() {
        registerService.add(reg);
        return "register";
    }


}
