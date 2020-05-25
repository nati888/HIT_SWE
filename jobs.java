package sample;

public class  Jobs{
    private  int Job_ID;
    private  String Job_Name;

    // constructor
    public Jobs(int Job_ID,String Job_Name) {
        this.Job_ID = Job_ID;
        this.Job_Name = Job_Name;
       }
 

void changeJobName(String new_name)
{
	this.Job_Name=new_name;
}