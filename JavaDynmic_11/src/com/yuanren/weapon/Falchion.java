package com.yuanren.weapon;

public class Falchion  extends Weapon implements WeaponOtherFunction{


    public Falchion() {
        super("青龙偃月刀", 21);
    }

    @Override
    public void attack(Fighter fighter1, Fighter fighter2) {
        int attack = fighter1.getWeapon().getAttack()+newAttack();
        int hp = fighter2.getHp();
        hp = hp - attack;
        fighter2.setHp(hp);

        System.out.println(fighter1.getName()+"使用"+fighter1.getWeapon().getName()+",对"+fighter2.getName()+"造成了"+attack+"伤害"
                +fighter2.getName()+"生命值还剩:"+fighter2.getHp());
    }

    @Override
    public int newAttack() {
        return (int)(Math.random()*20);
    }
}
