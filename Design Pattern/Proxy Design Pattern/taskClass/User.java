package taskClass;

public class User {
    private String name;
    private int age;
    private int userId;

    public User(String name,int age,int userId){
        this.name=name;
        this.age=age;
        this.userId=userId;
    }

    // getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    // setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
