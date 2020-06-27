package sample.controller;

import sample.model.*;
import java.util.ArrayList;


public class deleteWorkerController {

    private static deleteWorkerController Instance;
    private deleteWorkerRepository delete_worker_repository =deleteWorkerRepository.getMySingelton();

    private deleteWorkerController() {
    }

    public static deleteWorkerController getMySingelton() {
        if (Instance == null)
            Instance = new deleteWorkerController();
        return Instance;
    }

    public boolean delete(String ID){
        if (ID.equals(""))
            return false;
        String session = delete_worker_repository.deleteWorker(ID);
        if (session != null) {
            System.out.println("Session token: " + session);
            return true;
        }
        return false;
    }

}

