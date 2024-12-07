package com.example.designpattern.builder;

/**
 * 1、抽象建造者
 */
public abstract class Builder {

    public abstract void setPart(String name, String type);

    public abstract Product getProduct();
}

