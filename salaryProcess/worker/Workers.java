package salaryProcess.worker;

import java.util.ArrayList;

public class Workers {
    private ArrayList<Worker> worker_List;
    public Workers() {
        worker_List =new ArrayList<Worker>();
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
}