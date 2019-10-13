package fubyaka6.CRUD;

import java.util.*;

public class UserService {
    private Map<String, User> users;

    public UserService() {
        users = new HashMap<String, User>();
        users.put("admin", new User("admin", "admin", "Kirya"));
    }
    public boolean addUsers(User user) {
        if(!(users.containsKey(user.getLogin()))) {
            users.put(user.getLogin(), user);
            return true;
        }
        else {
            return false;
        }
    }
    public User getByLogin(String login) {
        return users.get(login);
    }
    public boolean deleteByLogin(String login){
        if(users.containsKey(login)) {
            users.remove(login);
            return true;
        }
            else {
            return false;
        }
    }
    public List<User> getAllUsers() {
        List<User> users2 = null;
        for (int i = 0; i < users.size(); i++) {
            users2.add(users.get(i));
        }
        return users2;
    }
    public boolean editUser(User user) {
            if(users.containsKey(user.getLogin())) {
                users.put(user.getLogin(), user);
                return true;
            }
            else {
                return false;
            }
    }
    public boolean auth(String login, String password) {
        if(users.containsKey(login)) {
            if(users.get(login).getPassword().equals(password)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}
