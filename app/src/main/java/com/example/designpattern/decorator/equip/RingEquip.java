package com.example.designpattern.decorator.equip;

import com.example.designpattern.decorator.IEquip;

/**
 * 戒指
 * 攻击力 5
 */
public class RingEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }
}