package sample.model;
import java.util.ArrayList;
import java.util.UUID;

public class addWorkerRepository {


    private static addWorkerRepository Instance;
    private addWorkerRepository() { }

    public static addWorkerRepository getMySingelton(){
        if(Instance==null)
            Instance=new addWorkerRepository();
        return Instance;
    }

    public String addWorker(String last_name,String first_name,String ID, String mail,String department_id, String Job_ID, String experience, String base_salary, String hours, String user_name, String password){
        Workers worker_list=Workers.getMySingelton();
        for (int i = 0; i < worker_list.getSize(); i++)
            if (worker_list.getWorker_i(i).getIDperson()==Integer.parseInt(ID) )
                return null;
        Worker worker=new Worker( last_name, first_name, Integer.parseInt(ID),  mail, Integer.parseInt(department_id),  Integer.parseInt(Job_ID),Integer.parseInt(experience), Integer.parseInt(base_salary), Integer.parseInt(hours), user_name,  password);
        worker_list.addWorker(worker);
        return UUID.randomUUID().toString();
    }

}
