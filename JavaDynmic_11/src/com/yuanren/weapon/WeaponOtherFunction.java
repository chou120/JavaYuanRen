package com.yuanren.weapon;

public interface WeaponOtherFunction {

    /**  吕布    生命值     1000
     *          方天画戟    攻击技能 （造成的伤害）
     *
     *  关羽   生命值 青龙偃月刀   攻击技能
     *  张飞  生命值 丈八蛇矛     攻击技能
     *  刘备  生命值 雌雄双股剑   攻击技能
     *
     *      铁匠  给武器增加新技能
     *
     *      利用抽象类  接口  + 多态的方式 写这个游戏
     */

    int newAttack();

}
