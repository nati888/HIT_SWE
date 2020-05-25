import java.util.ArrayList;

public class Departement {
    private int ID;
    private  String Name;
    private ArrayList<Worker> Workres;

    public Departement(int id, String name, ArrayList<Worker> Workres) {
        this.ID = id;
        this.Name = name;
        this.Workres = new ArrayList<Worker>();
    }
    void addWorker(Worker new_worker){
        Workres.add(new_worker);
    }
    void removeWorker(Worker remove_worker) {
        Workres.remove(remove_worker);
    }
//    void create_report(){
//
//    }

}
