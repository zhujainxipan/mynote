package com.ht.mynote.dao;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA
 * Project: com.ht.mynote.dao
 * Author: 安诺爱成长
 * Email: 1399487511@qq.com
 * Date: 2015/5/2
 */
public class MyNote implements Serializable {
    private String title;

    private String content;

    private String time;


    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
