package sample;

abstract class  Person{
    private  int ID;
    private  String last_name;
    private  String first_name;
    // constructor
    public Person(String last_name,String first_name,int ID) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.ID = ID;
       }
    }