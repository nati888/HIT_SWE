package sample.model;

import sample.model.Person;

import java.util.ArrayList;

public class Worker extends Person {
    int NUM_WORKER = 1;

    public Worker(String last_name, String first_name, int ID, String mail,int department_id, int Job_ID, float experience, float base_salary, float hours,String user_name, String password) {
        super(last_name, first_name, ID,mail);
        this.num_Worker = NUM_WORKER++;
        this.department_ID = department_id;
        this.experience = experience;
        this.base_Salary = base_salary;
        this.hours = hours;
        this.assessment = new ArrayList<String>();
        this.user_name=user_name;
        this.password = password;
        this.job_ID = job_ID;
    }



    private int num_Worker;
    private int department_ID;
    private float experience;
    private float base_Salary;
    private float hours;
    private ArrayList<String> assessment;
    private String user_name;
    private String password;
    private int job_ID;

    public int getNum_Worker() { return num_Worker; }
    public int getDepartment_ID() { return department_ID; }
    public float getExperience() { return experience; }
    public float getBase_Salary() { return base_Salary; }
    public float getHours() { return hours; }
    public ArrayList<String> getAssessment() { return assessment; }
    public String getPassword() { return password; }
    public String getUser_name(){ return user_name;}
    public int getJob_ID() { return job_ID; }
    public void setHours(float hours) { this.hours = hours; }
    void changeJobID(int new_ID){
        this.job_ID=new_ID;
    }
    void changeExperience(float new_experience){
        this.experience=new_experience;
    }
    void changeDepartmentID(int new_department){
       this.department_ID=new_department;
    }
    void changeSalary(float new_salary){
       this.base_Salary=new_salary;
    }
    float calculateSalary(){
        return base_Salary*hours;
    }
    void addAssessment(String assessment1){
        assessment.add( assessment1);
    }
    boolean changePassword(String new_pass) {
        if (new_pass.length() > 8)
        {
            this.password = new_pass;
            return true;
        }
        return false;
    }

}

