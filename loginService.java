package sample.model;
import java.util.ArrayList;
import java.util.UUID;

public class loginService {
    static private loginService Instance;
    private loginRepository loginRepo=loginRepository.getMySingelton();
    private loginService(){
    }

    public static loginService getMySingelton(){
        if(Instance==null)
            Instance=new loginService();
        return Instance;
    }

    public String login(String user_name,String password){
        if(this.loginRepo.validateUser(user_name, password))
            return UUID.randomUUID().toString();
        return null;
    }
}
