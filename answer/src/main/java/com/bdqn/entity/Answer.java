package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Answer implements Serializable {
    private static final long serialVersionUID = -1019010518858200238L;
    private Integer id;
    private String ansContent;
    private int qid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date ansDate;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAnsContent() {
        return ansContent;
    }
    public void setAnsContent(String ansContent) {
        this.ansContent = ansContent;
    }
    public int getQid() {
        return qid;
    }
    public void setQid(int qid) {
        this.qid = qid;
    }
    public Date getAnsDate() {
        return ansDate;
    }
    public void setAnsDate(Date ansDate) {
        this.ansDate = ansDate;
    }
    @Override
    public String toString() {
        return "Answer [id=" + id + ", ansContent=" + ansContent + ", qid=" + qid + ", ansDate=" + ansDate + "]";
    }
    public Answer(Integer id, String ansContent, int qid, Date ansDate) {
        super();
        this.id = id;
        this.ansContent = ansContent;
        this.qid = qid;
        this.ansDate = ansDate;
    }
    public Answer() {
    }


}
