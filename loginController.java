package sample.controller;

import sample.model.Worker;
import sample.model.Workers;
import sample.model.loginService;

import java.util.ArrayList;

public class loginController {

    private static loginController Instance;
    private loginService login_Service=loginService.getMySingelton();
    private loginController() {
    }

    public static loginController getMySingelton(){
        if(Instance==null)
            Instance=new loginController();
        return Instance;
    }
    public boolean login(String user_name, String password) {
        if (user_name == null || password == null)
            throw new IllegalArgumentException("user and password must be null");
        String session = login_Service.login(user_name, password);
        if (session != null) {
            System.out.println("Session token: " + session);
            return true;
        }
        return false;
    }
}
