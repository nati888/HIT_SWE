package sample.model;
import java.util.ArrayList;

public class addWorkerRepository {


    private static addWorkerRepository Instance;
    private addWorkerRepository() { }

    public static addWorkerRepository getMySingelton(){
        if(Instance==null)
            Instance=new addWorkerRepository();
        return Instance;
    }

    public boolean addWorker(String last_name,String first_name,String ID, String mail,String department_id, String Job_ID, String experience, String base_salary, String hours, String user_name, String password){
        Worker worker=new Worker( last_name, first_name, (int)ID,  mail, department_id,  Job_ID,  experience,  base_salary, hours, user_name,  password);
        worker_list.addWorker(worker);
        for (int i = 0; i < worker_list.getSize(); i++)
            if (worker_list.getWorker_i(i).getUser_name().equals(user_name) && worker_list.getWorker_i(i).getPassword().equals(password))
                return true;
        return false;

    }
}
}
