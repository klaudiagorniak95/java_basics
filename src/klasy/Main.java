package klasy;

import java.util.List;

public class Main {
    public static void main(String[] args){
        User[] users = new User[4];
        users[0] = new User("login1", "haslo1", "email1@email.com", (byte) 32);
        users[1] = new User("login2", "haslo2", "email2@email.com", (byte) 12);
        users[2] = new User("login3", "haslo3", "email3@email.com", (byte) 44);
        users[3] = new User("login4", "haslo4", "email4@email.com", (byte) 82);

        UserService userService = new UserService(users);
        User foundUser = userService.findUserByLogin("login2");
        if (foundUser != null) {
            System.out.println("Znaleziono usera o loginie: " + foundUser.login);
        } else {
            System.out.println("Nie znaleziono usera");
        }

        List<User> foundUsers = userService.findUsersByLogin("lo");
        if (foundUsers != null) {
            System.out.print("Znaleziono uzytkownikow: " + foundUsers.size());
        }
    }
}
