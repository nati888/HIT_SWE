package sample.controller;

import sample.model.Worker;
import sample.model.Workers;

public class SortingWorkers {
    WorkerComparator comparator;
    public SortingWorkers(WorkerComparator comparator){this.comparator=comparator;}
    public void bubbleSort(){
        Workers worker_list=Workers.getMySingelton();
        int n=worker_list.getSize();
        for(int pass=1; pass<n;pass++)
            for(int i=0;i<n-pass;i++){
            if(comparator.compare(worker_list.getWorker_i(i),worker_list.getWorker_i(i+1))>0){
                Worker temp=worker_list.getWorker_i(i);
                worker_list.setWorker_List_i(i,worker_list.getWorker_i(i+1));
                worker_list.setWorker_List_i(i+1,temp);
            }
            }


    }
}
