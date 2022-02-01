import java.util.*;

class Contacts{
    String name; // Name of the contact
    long phoneNumber; //Phone numer of the Contact
    ArrayList<Status> listStatus; // List of status

    Contacts(String name, long phoneNumber, ArrayList<Status> listStatus){//Constructor
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.listStatus = listStatus;
    }

    public String getName(){ // Get name of the contact
        return name;
    }

    public long getPhoneNumber(){ // Get Phone number of the contact
        return phoneNumber;
    }

    public ArrayList<Status> getList(){ // Get list of the status
        return listStatus;
    }
}