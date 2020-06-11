package sample;

import sample.model.Worker;

public class sortingWorkerJobID implements WorkerComparator {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        return worker1.getJob_ID()-worker2.getJob_ID();
    }
}
