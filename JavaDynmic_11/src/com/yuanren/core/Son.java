package com.yuanren.core;

public class Son  extends Person{

    public  String  address="儿子在日本";
    /**
     * 如果子类有的成员,那么就不会去使用父类的成员   那么思考 这句话一定对吗
     *
     *
     *      多态执行的便捷方式:
     *          方法的执行看右边
     *                       Person person = new Son();  //类型提升了
     *                        person.makeMoney("直播");
     *          成员变量的使用看左边
     *                      Person  person1=new  Son();
     *                      System.out.println(person1.address);
     *          静态不属于多态一说  也不存在重写一说
     *
     * @param jobType
     */

    @Override
    public void makeMoney(String jobType) {
        System.out.println("子类通过"+jobType+"赚钱,但是钱不够又去做兼职");
    }

    public  static  void  marry(){
        System.out.println("儿子结婚");
    }

}
