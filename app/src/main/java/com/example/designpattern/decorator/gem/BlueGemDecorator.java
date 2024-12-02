package com.example.designpattern.decorator.gem;

import com.example.designpattern.decorator.IEquip;
import com.example.designpattern.decorator.IEuipDecorator;

/**
 * 蓝宝石装饰品
 * 每颗攻击力: +5
 */

public class BlueGemDecorator implements IEuipDecorator {

    private IEquip iEquip;
    private static final int BLUE_ATTACK = 5;

    public BlueGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int caculateAttack() {
        return iEquip.caculateAttack() + BLUE_ATTACK;
    }

    @Override
    public String description() {
        return iEquip.description() + " + 蓝宝石";
    }
}