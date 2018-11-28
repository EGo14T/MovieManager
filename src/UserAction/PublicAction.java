package UserAction;

import com.opensymphony.xwork2.ActionSupport;


public class PublicAction extends ActionSupport {

    private String title;
    private String content;
    private String date;


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String execute() {
        return SUCCESS;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;

    }


}
