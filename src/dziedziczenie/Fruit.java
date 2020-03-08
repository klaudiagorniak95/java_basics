package dziedziczenie;

public class Fruit {
    String name;

    public Fruit(String name){
        this.name = name;
    }

    public String getName() {
        return "Ten owoc nazywa sie: " + this.name;
    }
}
