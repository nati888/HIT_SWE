package salaryProcess.worker;

import java.util.ArrayList;

public class Department {
    private int ID;
    private  String Name;
    private ArrayList<Worker> Workers;

    public Department(int id, String name, ArrayList<Worker> Workres) {
        this.ID = id;
        this.Name = name;
        this.Workers = new ArrayList<Worker>();
    }
    void addWorker(Worker new_worker){
        Workers.add(new_worker);
    }
    void removeWorker(Worker remove_worker) {
        Workers.remove(remove_worker);
    }
//    void create_report(){
//
//    }

}

