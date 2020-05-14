package sample;

public class Worker extends Person {
    public Worker(String last_name, String first_name, int ID, int ID_Worker, String job_name, int department_id, float experience, float base_salary, float hours, String assessment, String password) {
        super(last_name, first_name, ID);
        this.job_name = job_name;
        this.department_ID = department_id;
        this.experience = experience;
       this.base_Salary = base_salary;
        this.hours = hours;
        this.assessment = assessment;
        this.password = password;
        this.ID_Worker = ID_Worker;
    }

    private int ID_Worker;
    private String job_name;
    private int department_ID;
    private float experience;
    private float base_Salary;
    private float hours;
    private String assessment;
    private String password;
}
