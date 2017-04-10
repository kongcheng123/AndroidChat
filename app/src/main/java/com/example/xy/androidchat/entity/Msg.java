package com.example.xy.androidchat.entity;

/**
 * Created by xy on 2017/4/8.
 */

public class Msg {
    public static final int TYPE_RECEIVED=0;
    public static final int TYPE_SENT=1;
    private String context;
    private int type;


    public Msg(String context, int type) {
        this.context = context;
        this.type = type;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
