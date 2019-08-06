package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class    Question implements Serializable {
    private static final long serialVersionUID = -2001875683186228709L;
    private Integer id;
	private String title;
	private String detailDesc;
	private Integer answerCount;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	private Date lastModified;
	
	private List<Answer> list;

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

	public String getDetailDesc() {
		return detailDesc;
	}

	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

	public Integer getAnswerCount() {
		return answerCount;
	}

	public void setAnswerCount(Integer answerCount) {
		this.answerCount = answerCount;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public List<Answer> getList() {
		return list;
	}

	public void setList(List<Answer> list) {
		this.list = list;
	}

	public Question() {
	}

	public Question(Integer id, String title, String detailDesc, Integer answerCount, Date lastModified,
			List<Answer> list) {
		super();
		this.id = id;
		this.title = title;
		this.detailDesc = detailDesc;
		this.answerCount = answerCount;
		this.lastModified = lastModified;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", detailDesc=" + detailDesc + ", answerCount=" + answerCount
				+ ", lastModified=" + lastModified + ", list=" + list + "]";
	}
	
	
}
