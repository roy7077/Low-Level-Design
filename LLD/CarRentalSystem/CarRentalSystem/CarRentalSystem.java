package CarRentalSystem;

import java.util.ArrayList;

import Location.Location;
import Store.Store;
import Users.User;

public class CarRentalSystem {
    ArrayList<Store> stores;
    ArrayList<User> users;

    public CarRentalSystem(){
        stores=new ArrayList<Store>();
        users=new ArrayList<User>();
    }

    // get store present on the location
    public Store getStore(Location location){
        for (Store store : stores) {
            if(store.getLocation()==location)
            return store;
        }
        return null;
    }

    // add store
    public void addStore(Store store){
        this.stores.add(store);
    }

    // add user
    public void addUser(User user){
        this.users.add(user);
    }

    // remove store
    public void removeStore(Store store){
        stores.remove(store);
    }

    // remove user
    public void removeUser(User user){
        users.remove(user);
    }
}
