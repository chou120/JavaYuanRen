package com.yuanren.core2;

public  abstract class Weapon {
    public  abstract  void  addNewAttack();

    public  abstract  void  login(String name,String password);


    public Weapon(){}

    //局部内部类
    public static void  show(){

     final   int  age=12;  //是个常量
        /**
         * 匿名类使用的是成员变量就没有必须是`final`的限制了。因为匿名类在内存中存在的时间可能会比局部变量时间长，
         * 局部变量在方法调用结束后内存释放。匿名类的对象在方法调用后可能被其他类的成员引用，其中的方法如果在之后被调用，
         * 局部变量内存已经被释放了，所以会出现问题，为了解决这个问题，匿名类中使用的是局部变量的副本。为了让开发人员知道使用的是副本，
         * 所以要求必须使用`final`进行修饰。对于成员变量，声明周期跟随从堆内存中创建出来的对象，生命周期和匿名类一致，
         * 因此可以在匿名类中正常使用，并且匿名类中对变量值进行修改是对所有引用外部类对象的变量都生效的。
         */
          class  Inner{

              public    void  showInfo(){
                  // age=123; 是个常量
                  System.out.println(age);
              }

        }
    }





}
/*class  WeaponSon  extends  Weapon{
    @Override
    public void addNewAttack() {
        System.out.println("添加额外的属性");
    }
}*/
class  Test{

    public static void main(String[] args) {
        /*Weapon  weapon=new WeaponSon();
        weapon.addNewAttack();*/

        //如果一个对象里面的方法只被使用一次  那么我们可以使用匿名内部类的方式
       /* Weapon weapon = new Weapon() {
            @Override
            public void addNewAttack() {
                System.out.println("添加额外的属性");
            }
        };

        weapon.addNewAttack();
*/
        new Weapon() {
            @Override
            public void addNewAttack() {
                System.out.println("添加额外的属性");
            }
            @Override
            public void login(String name, String password) {
                    if(name.equals("展示干")&& password.equals("123")){
                        System.out.println("欢迎登录...");
                    }
            }
        }.addNewAttack();

        //这就相当于创建了一个匿名子类
        Weapon weapon=   new Weapon() {

            @Override
            public void addNewAttack() {
                System.out.println("添加额外的属性");
            }
            @Override
            public void login(String name, String password) {
                if(name.equals("展示干")&& password.equals("123")){
                    System.out.println("欢迎登录...");
                }
            }
        };
        weapon.addNewAttack();
        weapon.login("","");



    }

}