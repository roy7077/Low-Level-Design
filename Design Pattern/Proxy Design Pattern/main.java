import proxyClass.CrudProxyClass;
import taskClass.CrudClass;
import taskClass.User;

public class main {
    public static void main(String[] args) {
        try {
            // Admin proxy can perform all operations
            CrudClass adminProxy = new CrudProxyClass(true);
            adminProxy.createNewUser(new User("Sagar",21,1));
            adminProxy.createNewUser(new User("Sonu", 24,2));
            System.out.println(adminProxy.getUser(1));

            // User proxy (non-admin) should only be able to get users
            CrudClass userProxy = new CrudProxyClass(false);
            System.out.println(userProxy.getUser(2));

            // User (non-admin) tries to create a new user (should fail)
            userProxy.createNewUser(new User("Naina",23,3));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}