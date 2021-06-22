public enum Week {
    MONDAY("周一"),TUESDAY("周二"),WEDNESDAY("周三"),THURSDAY("周四"),FRIDAY("周五"),SATURDAY("周六"),SUNDAY("周日");

    private String  name;

    Week(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }


}
class  Test{

    public static void main(String[] args) {
        Week saturday = Week.SATURDAY;
        System.out.println(saturday.getName());

        Week[] values = Week.values();

        for (int i = 0; i < values.length; i++) {
            System.out.println(i+":"+values[i]);
        }
        System.out.println(Week.valueOf("FRIDAY"));

    }
}