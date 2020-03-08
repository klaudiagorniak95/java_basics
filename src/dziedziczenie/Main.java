package dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Human person = new Human("Klaudia");
        Superhero person2 = new Superhero("Thor", "Mjolnir");

        Fruit fruit_apple = new Fruit("apple");
        Fruit fruit_strawberry = new Fruit("strawberry");
        Fruit[] fruits = {fruit_apple, fruit_strawberry};
        for (Fruit f: fruits){
            System.out.println(f.getName());
        }

        Dog doggo = new Dog("Burek", "jamnik");
        System.out.println(doggo.getBreed());
        System.out.println(doggo.getName());
        doggo.setName("Szarik");
        System.out.println(doggo.getName());
    }
}
