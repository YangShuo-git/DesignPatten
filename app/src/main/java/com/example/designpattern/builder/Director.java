package com.example.designpattern.builder;

/**
 * 4、导演类
 */
public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getAProduct() {
        builder.setPart("奥迪汽车", "Q5");
        return builder.getProduct();
    }

    public Product getBProduct() {
        builder.setPart("宝马汽车", "X7");
        return builder.getProduct();
    }
}
