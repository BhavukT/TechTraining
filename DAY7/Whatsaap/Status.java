import java.util.*;
class Status {
    private String contact;
    private String type;
    private ArrayList<User> viewedBy;
    private Date setDateTime;
    
    Status(String contact, String type, Date setDateTime){
        this.contact = contact;
        this.type = type;
        this.setDateTime = setDateTime;
        this.viewedBy = new ArrayList<User>();
    }

    public String getContact(){
        return contact;
    }

    public String getType(){
        return type;
    }

    public Date setDateTime(){
        return setDateTime;
    }
}
