package homework2;

public class Video {
    //- 片名
// - 是否被出租的标识
// - 用户的平均评分

    private String name; //片名
    private boolean isRent; // 是否被出租的标识
    private int mark;//用户的平均评分
    private int markTimes; //用户评分次数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRent() {
        return isRent;
    }

    //设置借出/归还是否成功
    public boolean setRent(boolean rent) {
        this.isRent=rent;
        return rent;
    }

    public int getMark() {
        return mark;
    }

    public int getMarkTimes() {
        return markTimes;
    }

    public void setMarkTimes(int markTimes) {
        this.markTimes = markTimes;
    }

    public void setMark(int mark) {
                  // this.mark  用户平均分   markTimes  打分的次数
        int   markSum=this.mark*this.markTimes+mark ;//之前用户的总评分 + 新一轮借出去的评分
        int   count=this.markTimes+1;  //每借出一次   markTimes+1
        this.markTimes=count;
        this.mark=markSum/count;

    }

    @Override  //重写
    public String toString() {
        return "Video{" +
                "name='" + this.name + '\'' +
                ", isRent=" + this.isRent +
                ", mark=" + this.mark +
                ", markTimes=" + this.markTimes +
                '}';
    }
}
