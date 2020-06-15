package sample.controller;

import sample.model.Worker;

public class sortingWorkerName implements  WorkerComparator {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        return worker1.getLast_name().compareTo(worker2.getLast_name());
    }
}
