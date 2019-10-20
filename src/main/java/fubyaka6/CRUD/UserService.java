package fubyaka6.CRUD;

import java.util.*;

public class UserService {
    private Map<String, User> users;

    public UserService() {
        users = FileHelper.readFromFile("src\\main\\java\\fubyaka6\\CRUD\\users");
        users.put("admin", new User("admin", "admin", "Kirya"));
    }
    public void savToData() {
        FileHelper.saveToFile("src\\main\\java\\fubyaka6\\CRUD\\users", users);
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
    public User getByLogin (String login){
        if(users.containsKey(login)) {
            System.out.println(users.get(login));
        }
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
        System.out.println(users.values());
        return new ArrayList<>(users.values());
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
