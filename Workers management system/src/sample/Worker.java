import java.util.ArrayList;

public class Worker extends Person {
    int NUM_WORKER=1;
    public Worker(  String last_name, String first_name, int ID,int ID_Worker, String job_name, int department_id,int Job_ID, float experience, float base_salary, float hours, ArrayList<String> assessment, String password) {

        this.job_name = job_name;
        this.department_ID = department_id;
        this.experience = experience;
        this.base_Salary = base_salary;
        this.hours = hours;
        this.assessment =new  ArrayList<String>();
        this.password = password;
        this.ID_Worker=NUM_WORKER++;
        this.job_ID=job_ID;
    }
    private int  ID_Worker;
    private String job_name;
    private int department_ID;
    private float experience;
    private float base_Salary;
    private  float hours;
    private ArrayList<String> assessment;
    private  String password;
    private int  job_ID;
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
    void changeJobName(String new_job_name){
       this.job_name=new_job_name;
    }
    float caluculateSalary(){
        return base_Salary*hours;
    }
    void addAssessement(String assessment1){
        assessment.add(assessment1);
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

