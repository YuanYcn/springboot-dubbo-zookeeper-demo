package com.bdqn.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class Page<T> implements Serializable {

    private static final long serialVersionUID = -8431782062243668352L;

    private int count;
    private List<T> list;
    private Integer start;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public List<T> getList() {
        return list;
    }
    public void setList(List<T> list) {
        this.list = list;
    }
}