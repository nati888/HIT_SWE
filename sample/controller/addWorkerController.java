package sample.controller;

import sample.model.*;

import java.util.ArrayList;

public class addWorkerController {

    private static addWorkerController Instance;
    private addWorkerRepository add_worker_repository = addWorkerRepository.getMySingelton();

    private addWorkerController() {
    }

    public static addWorkerController getMySingelton() {
        if (Instance == null)
            Instance = new addWorkerController();
        return Instance;
    }

    public boolean add(String last_name, String first_name, String ID, String mail, String department_id, String Job_ID, String experience, String base_salary, String user_name, String password) {
        if (last_name.equals("") || first_name.equals("") || ID.equals("") || mail.equals("") || department_id.equals("") || Job_ID.equals("") || experience.equals("") || base_salary.equals("") || user_name.equals("") || password.equals(""))
            return false;
            String session = add_worker_repository.addWorker(last_name, first_name, ID, mail, department_id, Job_ID, experience, base_salary, user_name, password);
            if (session != null) {
                System.out.println("Session token: " + session);
                return true;
            }
            return false;
        }

    }

