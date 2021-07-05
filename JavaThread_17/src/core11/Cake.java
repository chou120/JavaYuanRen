package core11;

public class Cake {

    private  double  weight;
    private String  type;


    public Cake(double weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public Cake() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
