package taskClass;

public interface CrudClass {
    void createNewUser(User newUser) throws Exception;
    void deleteUser(int userId) throws Exception;
    User getUser(int userId) throws Exception;
}
