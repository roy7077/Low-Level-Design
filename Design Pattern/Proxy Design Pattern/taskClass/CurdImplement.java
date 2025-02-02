package taskClass;

import java.util.HashMap;
import java.util.Map;

public class CurdImplement implements CrudClass{
    private Map<Integer, User> userDatabase = new HashMap<>();

    @Override
    public void createNewUser(User newUser) throws Exception {
        if (userDatabase.containsKey(newUser.getUserId())) {
            throw new Exception("User with ID " + newUser.getUserId() + " already exists.");
        }
        userDatabase.put(newUser.getUserId(), newUser);
        System.out.println("User created: " + newUser);
    }

    @Override
    public void deleteUser(int userId) throws Exception {
        if (!userDatabase.containsKey(userId)) {
            throw new Exception("User with ID " + userId + " not found.");
        }
        userDatabase.remove(userId);
        System.out.println("User deleted with ID: " + userId);
    }

    @Override
    public User getUser(int userId) throws Exception {
        if (!userDatabase.containsKey(userId)) {
            throw new Exception("User with ID " + userId + " not found.");
        }
        return userDatabase.get(userId);
    }
}