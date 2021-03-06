package com.nic.domain;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Long id;
    private String post_id;
    private Long replyed_id;
    private Long author_id;
    private String author_name;
    private String content;
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public Long getReplyed_id() {
        return replyed_id;
    }

    public void setReplyed_id(Long replyed_id) {
        this.replyed_id = replyed_id;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
