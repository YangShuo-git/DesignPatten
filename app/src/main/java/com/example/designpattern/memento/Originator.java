package com.example.designpattern.memento;

/**
 * 2. 创建 Originator 类。发件人
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // 将状态保存至备忘录
    public Memento setSateToMemento() {
        return new Memento(state);
    }

    // 从备忘录中获取状态
    public String getStateFromMemento(Memento memento) {
        return memento.getState();
    }
}
