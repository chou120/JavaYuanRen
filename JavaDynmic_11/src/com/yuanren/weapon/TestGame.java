package com.yuanren.weapon;

public class TestGame {

    public static void main(String[] args) {

        Falchion falchion = new Falchion();
        Flayer flayer = new Flayer();

        Fighter guanYu = new Fighter("关羽", falchion);
        Fighter lbBu = new Fighter("吕布", flayer);

        //补全  张飞和刘备    扩展  给所有人的武器都可以增加其他的攻击技能

        while(true){
           if(guanYu.getHp()<0){
               System.out.println("游戏结束");
               break;
           }
            guanYu.getWeapon().attack(guanYu,lbBu);
            lbBu.getWeapon().attack(lbBu,guanYu);
        }
    }

}
