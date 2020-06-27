package sample.model;

import model.Excel;
import sample.model.Worker;

import java.io.IOException;
import java.util.ArrayList;

public class Departement {
    private int ID;
    private  String Name;
    private ArrayList<Worker> Workers;

    public Departement(int id, String name, ArrayList<Worker> Workres) {
        this.ID = id;
        this.Name = name;
        this.Workers = new ArrayList<Worker>();
    }

    int getID(){ return ID;}
    String getName(){return Name;}
    ArrayList<Worker> getWorkers(){return Workers;}
    void changeDepartmentName(String new_name){Name=new_name;}
    void addWorker(Worker new_worker){
        Workers.add(new_worker);
        Excel.add_Worker_To_Excel(new_worker);
    }
    void removeWorker(Worker remove_worker) throws IOException {
        Excel.fired_Workers_Excel(remove_worker);
        Workers.remove(remove_worker);
        Excel.clear_Excel();
        for(int i=0;i<Workers.size();i++){
            Worker worker=this.Workers.get(i);
            Excel.add_Worker_To_Excel(worker);

        }

    }
//    void create_report(){
//
//    }

}
