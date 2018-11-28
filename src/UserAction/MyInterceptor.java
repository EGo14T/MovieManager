package UserAction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
    public String intercept(ActionInvocation ai) throws Exception {
        Object object = ai.getAction();
        if (object != null) {
            if (object instanceof PublicAction) {
                PublicAction ac = (PublicAction) object;
                String content = ac.getContent();

                ai.invoke();

            } else {
                return Action.LOGIN;
            }
        }
        return Action.LOGIN;
    }
}
