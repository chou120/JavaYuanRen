package com.yuanren.core;

public class Util {

    private Util() {

    }

    /**
     * 用来对大儿子的各种操作
     *
     * @param son
     */
    public static void getStr(Son son, String type) {
        son.setName("哈哈是");
        son.makeMoney(type);
    }
    /**
     * 用来对2儿子的各种操作
     *
     * @param son2
     */
    public static void getStr(Son2 son2, String type) {
        son2.setName("哈哈是");
        son2.makeMoney(type);
    }

    /**
     * 用来对小儿子的各种操作
     *
     * @param son3
     */
    public static void getStr(Son3 son3, String type) {
        son3.setName("哈哈是");
        son3.makeMoney(type);
    }


    /**
     * 优化重载的代码
     */
    public static void getStr(Person person, String type) {  //用父类Person  来接受多态传递过来的对象  可以看成  编译器在执行之前去jvm中检查传过来的一个具体对象
        person.setName("哈哈是");
        person.makeMoney(type);
    }








}
