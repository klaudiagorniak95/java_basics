package klasy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserService {

    private User[] users = new User[4];

    public UserService(User[] users) {
        this.users = users;
    }

    /**
     * funkcja zwraca obiekt User
     * @param login
     * @return User
     */

    public User findUserByLogin(String login) {
        for (User u : users) {
            boolean isLogin = u.login.equals(login);
            if (isLogin) {
                return u;
            }
        }
        return null;
    }

    /**
     * funkcja zwraca listę User
     * @param login
     * @return List<User>
     */

    public List<User> findUsersByLogin(String login){
        List<User> usersList = new LinkedList<>();
        for (User u  : users) {
            boolean containsLogin = u.login.startsWith(login);
            if (containsLogin) {
                usersList.add(u);
            }
            return usersList;
        }
        return null;
    }
}
