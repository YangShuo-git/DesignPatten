package com.example.designpattern.factory.simplefactory;

public class RouJiaMoStore {
    private SimpleRouJiaMoFactory factory;

    public RouJiaMoStore(SimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }

    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo RouJiaMo = factory.creatRouJiaMo(type);
        RouJiaMo.prepare();
        RouJiaMo.fire();
        RouJiaMo.pack();

        return RouJiaMo;
    }

}
