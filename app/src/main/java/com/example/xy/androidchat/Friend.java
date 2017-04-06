package com.example.xy.androidchat;

/**
 * Created by xy on 2017/4/6.
 */

public class Friend {
    private String name;
    private int imageId;

    public Friend(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
