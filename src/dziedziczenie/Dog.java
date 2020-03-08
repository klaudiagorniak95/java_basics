package dziedziczenie;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public String getName(){
        return name;
    }

    public void setName(String new_name){
        this.name = new_name;
    }

}
