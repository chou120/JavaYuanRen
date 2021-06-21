package com.yuanren.weapon;

public abstract class Weapon {

    //

    private  String  name;
    //武器基础伤害
    private  int  attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public   abstract  void    attack(Fighter  fighter1,Fighter fighter2);



}
