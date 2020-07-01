package sample.model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class calculateSalaryRepository {

    private static calculateSalaryRepository Instance;
    private calculateSalaryRepository() { }

    public static calculateSalaryRepository getMySingelton(){
        if(Instance==null)
            Instance=new calculateSalaryRepository();
        return Instance;
    }

    public String calculateSalary(String ID) throws IOException {
        Workers worker_list=Workers.getMySingelton();
        Worker worker=worker_list.searchingWorker(Integer.parseInt(ID));
        if (worker==null)
            return null;
        worker_list.removeWorker(worker);
        return UUID.randomUUID().toString();
    }

}
