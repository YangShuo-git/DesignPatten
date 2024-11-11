package com.example.designpattern.observer.javautil;

import java.util.Observable;

/**
 * 3D彩票服务号主题
 */

public class SubjectFor3d extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }

    /**
     * 更新主题消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
