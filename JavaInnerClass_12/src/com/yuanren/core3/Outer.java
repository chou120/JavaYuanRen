package com.yuanren.core3;
public class Outer {
    protected class Inner extends A {
        @Override
        public void add() {

        }
    }
    protected class Inner2 extends B {

        @Override
        public void register() {

        }
    }
    public Inner getInner(Weapon  weapon) {
        weapon.attack();
        return new Inner();
    }
}
class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().getInner(new Weapon() {
            @Override
            public void attack() {
                System.out.println("哈撒给");
            }
        });
        inner.add();
    }
}