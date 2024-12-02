package com.example.designpattern.decorator;

/**
 * 装备的接口
 * 武器、护腕、鞋子、戒指、装饰品等接口
 */

public interface IEquip {
    /**
     * 计算攻击力
     */
    public int caculateAttack();

    /**
     * 装备的描述
     */
    public String description();
}
