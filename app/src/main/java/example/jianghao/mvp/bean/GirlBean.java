package example.jianghao.mvp.bean;

/**
 * Created by jianghao on 2017/7/29.
 */

public class GirlBean {

    private int resource;
    private String title;
    private String description;

    public GirlBean(int resource, String title, String description) {
        this.resource = resource;
        this.title = title;
        this.description = description;
    }

    public int getResource() {
        return resource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
