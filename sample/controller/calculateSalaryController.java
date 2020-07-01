/*package sample.controller;
import sample.model.*;
import java.util.ArrayList;



public class calculateSalaryController {

    private static calculateSalaryController Instance;
    private calculateSalaryRepository calculate_salary_repository =calculateSalaryRepository.getMySingelton();

    private calculateSalaryController() {
    }

    public static calculateSalaryController getMySingelton() {
        if (Instance == null)
            Instance = new calculateSalaryController();
        return Instance;
    }

    public float calculateSalary(String ID){
        if (ID.equals(""))
            return -1;
        String session = calculate_salary_repository.calculateSalary(ID);
        if (session ==-1) {
            System.out.println("Session token: " + session);
            return true;
        }
        return false;
    }

}
*/
