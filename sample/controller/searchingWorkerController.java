package sample.controller;

import sample.model.*;

import java.util.ArrayList;

public class searchingWorkerController {

    private static searchingWorkerController Instance;
    private searchingWorkerRepository searching_worker_repository = searchingWorkerRepository.getMySingelton();

    private searchingWorkerController() {
    }

    public static searchingWorkerController getMySingelton() {
        if (Instance == null)
            Instance = new searchingWorkerController();
        return Instance;
    }

    public Worker searching(String ID) {
        if (ID.equals(""))
            return null;
        Worker worker = searching_worker_repository.searchingWorker(ID);
        if (worker != null) {
            return worker;
        }
        return null;

    }
}


