package core12;

public class Mon {
    private int  money;
    private String  name;

    public Mon() {
    }

    public Mon(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mon{" +
                "money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
