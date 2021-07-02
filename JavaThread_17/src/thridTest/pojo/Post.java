package thridTest.pojo;

import java.util.Date;

public class Post {
    private Integer id;
    private String  title;
    private String context;
    private Date createtime;
    private Integer  uid;
    private Integer  typeid;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Post() {
    }

    public Post(Integer id, String title, String context, Date createtime, Integer uid, Integer typeid) {
        this.id = id;
        this.title = title;
        this.context = context;
        this.createtime = createtime;
        this.uid = uid;
        this.typeid = typeid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", createtime=" + createtime +
                ", uid=" + uid +
                '}';
    }
}
