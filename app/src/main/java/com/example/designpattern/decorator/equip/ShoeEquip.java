package com.example.designpattern.decorator.equip;

import com.example.designpattern.decorator.IEquip;

/**
 * 鞋子
 * 攻击力: 5
 */

public class ShoeEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战靴子";
    }
}
