package salaryProcess.worker;

import java.util.ArrayList;
import java.util.Scanner;

public class SalaryCalculate {
    public static Workers worker_list=new Workers();

        public static boolean checkID(int userID){          //checks if the length of the ID is 9 digits
            int count=0;
            while ( userID>0){
                userID=userID/10;
                count++;
            }
            if(count!=9) {
                return false;
            }
            return true;
        }
        public static void main(String[] args) {

            //creating temporary list;
            String lastName="Irani", firstName="Sapir", jobName="test",pass="SapirIrani";
            int myID=315424689,depID=5,jobID=4;
            double expe=125,baseSalary=50,hours=200;
            ArrayList<String>assess=null;
            Worker myWorker = new Worker(lastName,firstName,myID,jobName,depID,jobID,expe,baseSalary,hours,assess,pass);
            worker_list.addWorker(myWorker);

            //Real Process;
            Scanner myObj =new Scanner(System.in);
            System.out.println("Enter user ID");
            int userID=myObj.nextInt();
            if(checkID(userID)) {
                System.out.println("Entered ID is: " + userID);
            }
            else{
                System.out.println("Your ID is too short");
            }
            Worker current_worker=worker_list.searchingWorker(userID);
            System.out.println(current_worker.getLast_name()+" "+current_worker.getFirst_name()+"'s salary is: "+current_worker.caluculateSalary());


        }
}
