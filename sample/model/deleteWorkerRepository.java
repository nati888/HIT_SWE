package sample.model;

import java.io.IOException;
import java.util.UUID;
import java.util.ArrayList;

public class deleteWorkerRepository {

    private static deleteWorkerRepository Instance;
    private deleteWorkerRepository() { }

    public static deleteWorkerRepository getMySingelton(){
        if(Instance==null)
            Instance=new deleteWorkerRepository();
        return Instance;
    }

    public String deleteWorker(String ID) throws IOException {
        Workers worker_list=Workers.getMySingelton();
        Worker worker=worker_list.searchingWorker(Integer.parseInt(ID));
        if (worker==null)
                return null;
        worker_list.removeWorker(worker);
        return UUID.randomUUID().toString();
    }

}
