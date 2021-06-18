package com.yuanren.core;

public class TestDynmic {


    public static void main(String[] args) {

        Son son = new Son();
        son.makeMoney("直播");

        // 父类引用指向子类对象       父类名   变量名=new   子类名（）;
        Person person = new Son();  //类型提升了
        person.makeMoney("直播");
        /**
         * 为什么这么用？
         *      多态是针对相同的行为，和数据类型无关。这样可以编写出更通用的方法，
         *      方法可以针对一类特定的行为，而不是针对单单一种数据类型。这样可以简化代码，并且增加了代码的扩展性，减少类和类之间的关联。
         */
      //  Util.getStr(person,"劳改");
        Util.getStr(person,"劳改");  //person  传递的具体对象是  new Son();

        System.out.println("-------------------------------------------");

        person = new Son2();
        person.makeMoney("抢劫");

        Util.getStr(person,"劳改2"); //  具体对象  new  Son2();
        System.out.println("-------------------------------------------");

        person = new Son3();
        person.makeMoney("被保养");

        Util.getStr(person,"劳改3"); //  具体对象  new  Son3();
        System.out.println("-------------------------------------------");

        Son son1 = new Son();
        Son son2 = new Son();
        Son son3= new Son();

     /*   Util.getStr(son2,"蹲监狱");
        Util.getStr(son3,"抢劫");
*/
        System.out.println();
        //只调用优化的方法


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        Person  person1=new  Son();
        System.out.println(person1.address);


        //如果发生方法重写 那么下面的代码得到的结果应该是儿子要结婚  但是结果是父类要结婚   所以静态方法根本不能算是重写
        Person  person2=new Son();
        person2.marry();//


        /**
         * 课堂练习
         * //一个人喜欢运动   人类有属性    名字   地址    行为有运动
         *         //  现在有几个不同的人也喜欢运动,但是呢喜欢的运动类型又不一样    xxx喜欢打篮球     yyy喜欢打羽毛球  zzz 乒乓球
         */






    }
}
