package com.cn.fenmo.pojo;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable {
    private Long mainid;

    private String title;
    
    private Integer state;

    private String newsrc;

    private Integer newstype;

    private String summary;

    private String userName;

    private Date createdate;

    private String content;
    
    private int zcount;

    private static final long serialVersionUID = 1L;

    public int getZcount() {
      return zcount;
    }

    public void setZcount(int zcount) {
      this.zcount = zcount;
    }

    public Integer getState() {
      return state;
    }

    public void setState(Integer state) {
      this.state = state;
    }

    public Long getMainid() {
        return mainid;
    }

    public void setMainid(Long mainid) {
        this.mainid = mainid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNewsrc() {
        return newsrc;
    }

    public void setNewsrc(String newsrc) {
        this.newsrc = newsrc == null ? null : newsrc.trim();
    }

    public Integer getNewstype() {
        return newstype;
    }

    public void setNewstype(Integer newstype) {
        this.newstype = newstype;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getUserName() {
      return userName;
    }

    public void setUserName(String userName) {
      this.userName = userName;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getContent() {
      return content;
    }

    public void setContent(String content) {
      this.content = content;
    }
}