package sample.controller;

import sample.model.Worker;
import sample.model.Workers;
import sample.model.loginRepository;
import sample.model.loginService;

import java.util.ArrayList;

public class addWorkerController {

    private static addWorkerController Instance;
    private loginService login_Service=loginService.getMySingelton();
    private addWorkerController() {
    }

    public static addWorkerController getMySingelton(){
        if(Instance==null)
            Instance=new addWorkerController();
        return Instance;
    }
    public boolean add(String last_name,String first_name,String ID, String mail,String department_id, String Job_ID, String experience, String base_salary, String hours, String user_name, String password) {
        if (last_name.equals("") || first_name.equals("") || ID.equals("") || mail.equals("")|| department_id.equals("") || Job_ID.equals("") || experience.equals("") || base_salary.equals("") || hours.equals("") || user_name.equals("")|| password.equals("")) {  {
            return false;
        }
        String session = login_Service.login(user_name, password);
        if (session != null) {
            System.out.println("Session token: " + session);
            return true;
        }
        return false;
    }
}
