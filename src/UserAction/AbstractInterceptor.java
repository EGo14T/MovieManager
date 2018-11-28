package UserAction;

import com.opensymphony.xwork2.ActionInvocation;
import org.omg.PortableInterceptor.Interceptor;

public abstract class AbstractInterceptor implements Interceptor {
    public void init() {

    }

    public void destory() {

    }

    public abstract String intercept(ActionInvocation invocation) throws Exception;

}
