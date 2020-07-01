package sample.model;

import java.util.UUID;
import java.util.ArrayList;

public class searchingWorkerRepository {

    private static searchingWorkerRepository Instance;
    private searchingWorkerRepository() { }

    public static searchingWorkerRepository getMySingelton(){
        if(Instance==null)
            Instance=new searchingWorkerRepository();
        return Instance;
    }

    public Worker searchingWorker(String ID){
        Workers worker_list=Workers.getMySingelton();
        Worker worker=worker_list.searchingWorker(Integer.parseInt(ID));
        if (worker==null)
            return null;
        return worker;
    }

}
