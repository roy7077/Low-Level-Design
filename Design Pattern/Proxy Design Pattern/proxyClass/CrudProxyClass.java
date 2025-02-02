package proxyClass;

import taskClass.CrudClass;
import taskClass.CurdImplement;
import taskClass.User;

public class CrudProxyClass implements CrudClass{
    CurdImplement obj;
    boolean isAdmin=false;

    public CrudProxyClass(boolean isAdmin){
        obj=new CurdImplement();
        this.isAdmin=isAdmin;
    }

    public void createNewUser(User newUser) throws Exception{
        if(!isAdmin){
            throw new Exception("User id not admin");
        }
        obj.createNewUser(newUser);
    }

    public void deleteUser(int userId) throws Exception{
        if(!isAdmin){
            throw new Exception("User id not admin");
        }
        obj.deleteUser(userId);
    }

    public User getUser(int userId) throws Exception{
        if(!isAdmin){
            throw new Exception("User id not admin");
        }
        return obj.getUser(userId);
    }
}