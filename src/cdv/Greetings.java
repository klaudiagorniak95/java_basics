package cdv;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){

//        pobieranie imienia i nazwiska z klawiatury

        Scanner personal_data = new Scanner(System.in);
        String name = personal_data.next();
        String surname = personal_data.next();
        System.out.print(fullname(name, surname));

    }

    public static String fullname(String name, String surname){
        String yourname;
        yourname = name + " " + surname;
        return "Hello, I'm " + yourname;
    }
}
