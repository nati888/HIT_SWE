package sample.controller;

import sample.model.Worker;

public class sortingWorkerExperience implements WorkerComparator {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        return (int)(worker1.getExperience()-worker2.getExperience());
    }
}
