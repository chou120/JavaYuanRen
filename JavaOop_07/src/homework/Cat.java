package homework;

public class Cat {
    private  String   type;
    private  String  color;

/*    方法
-- String getInfo
    返回 毛色+品种， 例如白色波斯猫，黑色英短

-- print
    向控制台输出 getInfo中的内容

-- playWith(Dog dog)
    向控制台输出 猫类getInfo+狗类的getInfo 一起玩，例如 白色波斯猫和傻哈士奇一起玩， 黑色英短和普通的柯基一起玩*/

    public  String  getInfo(){
        return  this.color+this.type;
    }

    public  String   print(){
        return  getInfo();
    }

    public  String   playWith(Dog  dog){
        return this.getInfo()+dog.getInfo();
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
