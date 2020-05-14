package sample;

import java.util.ArrayList;

public class Workers extends Worker {
    private ArrayList<Person> Worker = new ArrayList<Person>();

    public Workers(String last_name, String first_name, int ID, int ID_Worker, String job_name, int department_id, float experience, float base_salary, float hours, String assessment, String password) {
        super(last_name, first_name, ID, ID_Worker, job_name, department_id, experience, base_salary, hours, assessment, password);
    }


    void addWorker( Person worker){
        Worker.add(worker);

    }



}

