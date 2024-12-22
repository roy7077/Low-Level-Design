package Users;

public class User {
    String name;
    String age;
    String phoneNo;
    String drivingLsID;

    // Constructor
    public User(String name, String age, String phoneNo, String drivingLsID) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.drivingLsID = drivingLsID;
    }

    // Getters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    // Setters
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDrivingLsID() {
        return drivingLsID;
    }

    public void setDrivingLsID(String drivingLsID) {
        this.drivingLsID = drivingLsID;
    }
}
