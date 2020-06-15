package sample.controller;

import sample.controller.WorkerComparator;
import sample.model.Worker;

public class sortingWorkerSalary implements WorkerComparator {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        return (int)(worker1.getBase_Salary()-worker2.getBase_Salary());
    }
}
