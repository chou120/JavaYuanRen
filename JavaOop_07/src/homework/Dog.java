package homework;

public class Dog {

    private  String type;
    private  int IQ;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    /*   方法
    -- String getInfo
        返回  描述+品种，根据智商的值输出描述。（<20为傻， 20~80为普通的，>80为聪明的）例如 傻哈士奇，普通的柯基，聪明的金毛

    -- printInfo
        向控制台输出 getInfo 获取的内容

    -- playWith(homework.Cat cat)
        向控制台输出 狗品种和猫品种一起玩， 例如哈士奇和波斯猫一起玩
    */
    public  String getInfo(){
        String str="";
        if(this.IQ<20){
            str="傻";
        }else if(this.IQ>=20 && this.IQ<=80){
            str="普通的";
        }else {
            str="聪明的";
        }
        return str+this.type;
    }
    public  String printInfo(){
        return   getInfo();
    }

    public String playWith(Cat  cat){
        return this.type+cat.getType();
    }

}
