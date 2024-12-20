package com.web.services.resttemplate.Assignment_3;

public class Post3 {

    private int userId;
    private int id;
    private String title;
    private String body;

    public Post3(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nPost{" + "\n" +
                "userId=" + userId + ",\n"+
                "id=" + id + ",\n"+
                "title='" + title + "\n" +
                "body='" + body + "\n" +
                '}';
    }
}
