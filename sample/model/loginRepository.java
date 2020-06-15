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
        Worker worker=new Worker("irani","sapir",315424283,"sapirani081@gmail.com",3,3,10,10,10,null,"sapir","irani");
        worker_list.addWorker(worker);
        for (int i = 0; i < worker_list.getSize(); i++)
            if (worker_list.getWorker_i(i).getUser_name().equals(user_name) && worker_list.getWorker_i(i).getPassword().equals(password))
                return true;
        return false;

    }
}
