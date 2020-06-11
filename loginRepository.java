package sample.model;

import java.util.ArrayList;

public class loginRepository {


    private static loginRepository Instance;
    private loginRepository() { }

    public static loginRepository getMySingelton(){
        if(Instance==null)
            Instance=new loginRepository();
        return Instance;
    }

    public boolean validateUser(String user_name,String password){
        return true;

    }
}
