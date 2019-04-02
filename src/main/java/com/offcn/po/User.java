package com.offcn.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Author: Sunny
 * @Description:Ujiuye
 * @Date:Create：in 2019/3/22 0022 下午 4:31
 * @Modified By：
 */
public class User {
    private Long id;
    private String name;
    private Double score;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date createdate;
    //get\set alt+insert 出现生成菜单


    public User() {
    }

    public User(Long id, String name, Double score, Date createdate) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.createdate = createdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
