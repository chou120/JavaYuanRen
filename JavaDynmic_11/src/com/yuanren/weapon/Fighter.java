package com.yuanren.weapon;

public class Fighter {

    private String  name;
    private int    hp=1000;
    private Weapon  weapon;

    public Fighter() {
    }

    public Fighter(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
