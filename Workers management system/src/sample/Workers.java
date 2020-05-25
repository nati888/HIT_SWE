import java.util.ArrayList;

public class Workers {
    private ArrayList<Worker> Workers;

    public Workers(ArrayList<Worker> workers) {
        Workers =new ArrayList<Worker>();
    }
    void addWorker(Worker new_worker){
        Workers.add(new_worker);
    }
    void removeWorker(Worker remove_worker) {
        Workers.remove(remove_worker);
    }
    Worker searchingWorker(int ID){
        for (int i=0;i<this.Workers.size();i++){
           Worker worker=this.Workers.get(i);
           if(worker.getID_Worker()==ID)
               return worker;
        }
        return null;
    }
}
