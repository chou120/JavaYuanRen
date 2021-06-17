package club.banyuan;

public class Person {

    private String name;
    private int age;

    private  static  int  count=0;
    private  static  int  twoArgs=0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
        twoArgs++;
    }

    public Person(String name) {
        this.name = name;
        count++;
    }

    public Person() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +",count="+count+",twoArgs="+twoArgs
                '}';
    }
}
