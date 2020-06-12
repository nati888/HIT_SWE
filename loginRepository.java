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
        Workers worker_list=Workers.getMySingelton();
        for (int i = 0; i < worker_list.getSize(); i++)
            if (worker_list.getWorker_i(i).getUser_name() == user_name && worker_list.getWorker_i(i).getPassword()==password)
                return true;
        return true;

    }
}
