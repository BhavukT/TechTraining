import java.util.*;

class Contacts{
    String name;
    long phoneNumber;
    ArrayList<Status> listStatus;

    Contacts(String name, long phoneNumber, ArrayList<Status> listStatus){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.listStatus = listStatus;
    }

    public String getName(){
        return name;
    }

    public long phoneNumber(){
        return phoneNumber;
    }

    public ArrayList<Status> getList(){
        return listStatus;
    }
}