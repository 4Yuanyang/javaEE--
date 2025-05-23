package com.xyy.domain;

/**
 * 2025/5/18 22:12
 * 向远洋
 */
public class Image {
    private Integer id;
    private String head;
    private String url;
    private Integer hid;
    private String createTime;

    public Image() {
    }

    public Image(Integer id, String head, String url, Integer hid, String createTime) {
        this.id = id;
        this.head = head;
        this.url = url;
        this.hid = hid;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", head='" + head + '\'' +
                ", url='" + url + '\'' +
                ", hid=" + hid +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
