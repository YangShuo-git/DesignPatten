package com.example.designpattern.decorator.gem;

import com.example.designpattern.decorator.IEquip;
import com.example.designpattern.decorator.IEuipDecorator;

/**
 * 黄宝石装饰品
 * 每颗攻击力: +10
 */

public class YellowGemDecorator implements IEuipDecorator {

    private IEquip iEquip;
    private static final int YELLOW_ATTACK = 10;

    public YellowGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int caculateAttack() {
        return iEquip.caculateAttack() + YELLOW_ATTACK;
    }

    @Override
    public String description() {
        return iEquip.description() + " + 黄宝石";
    }
}

