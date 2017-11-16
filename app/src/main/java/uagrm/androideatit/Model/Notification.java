package uagrm.androideatit.Model;

/**
 * Created by Shep on 10/29/2017.
 */

public class Notification {
    public String title;
    public String body;

    public Notification(String title,String body ) {
        this.title = title;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
