package sample.model;

import java.util.ArrayList;

public class Workers {
    private static Workers Instance=new Workers();
    private static ArrayList<Worker> worker_List=new ArrayList<Worker>();
    private Workers() { }

    public static Workers getMySingelton(){
        return Instance;
    }

    void addWorker(Worker new_worker){
        worker_List.add(new_worker);
    }
    void removeWorker(Worker remove_worker) {
        worker_List.remove(remove_worker);
    }
    Worker searchingWorker(int ID){
        for (int i=0;i<this.worker_List.size();i++)
           if(worker_List.get(i).getIDperson()==ID)
               return worker_List.get(i);
        return null;
    }
    public int getSize(){
        return worker_List.size();
    }
    public  Worker getWorker_i(int i){
        return worker_List.get(i);
    }
    public void setWorker_List_i(int i,Worker new_worker){
        worker_List.set(i,new_worker);}
}
