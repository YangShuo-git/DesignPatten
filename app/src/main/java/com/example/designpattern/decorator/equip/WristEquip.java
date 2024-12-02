package com.example.designpattern.decorator.equip;

import com.example.designpattern.decorator.IEquip;

/**
 * 护腕
 * 攻击力: 5
 */

public class WristEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战护腕";
    }
}

