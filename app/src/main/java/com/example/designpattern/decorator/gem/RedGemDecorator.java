package com.example.designpattern.decorator.gem;

import com.example.designpattern.decorator.IEquip;
import com.example.designpattern.decorator.IEuipDecorator;

/**
 * 红宝石装饰品
 * 每颗攻击力: +15
 */

public class RedGemDecorator implements IEuipDecorator {

    private IEquip iEquip;
    private static final int RED_ATTACK = 15;


    public RedGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int caculateAttack() {
        return iEquip.caculateAttack() + RED_ATTACK;
    }

    @Override
    public String description() {
        return iEquip.description() + " + 红宝石";
    }
}

