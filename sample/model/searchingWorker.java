package sample.model;
import sample.model.Worker;
import sample.model.Workers;

import java.util.Scanner;



public class searchingWorker {

    static Workers worker_list=Workers.getMySingelton();


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ID");
        int id = input.nextInt();
        boolean id_check = checkID(id);
        while (id_check == false) {
            System.out.println("The id is invalid");
            System.out.println("Please enter ID");
            id = input.nextInt();
            id_check = checkID(id);
        }


        boolean id_exist = IDexist(id);
        if (id_exist == false) {
            System.out.println("There is no worker with id: " + id);
            System.exit(0);
        }


        Worker worker_by_id = worker_list.searchingWorker(id);


    }

    public static boolean checkID(int id) {
        int length = String.valueOf(id).length();
        if (length != 9)
            return false;
        else return true;
    }


       public static boolean IDexist(int id) {
           for (int i = 0; i < worker_list.getSize(); i++)
               if (worker_list.getWorker_i(i).getIDperson() == id)
                   return true;
           return false;
       }


    }

