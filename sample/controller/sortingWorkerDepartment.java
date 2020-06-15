package sample.controller;

import sample.model.Worker;

public class sortingWorkerDepartment  implements WorkerComparator {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        return worker1.getDepartment_ID()-worker2.getDepartment_ID();
    }
}
