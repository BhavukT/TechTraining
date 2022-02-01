import java.util.*;
class Status {
    private String contact; //Contact of the user who put the statsu
    private String type;  
    private ArrayList<User> viewedBy; //List of the persons who has seen your messages
    private Date setDateTime;
    private User uploadedBy; //User eho has uploaded the status

    
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

    public ArrayList<User> getViewedBy() { 
		return viewedBy;
	}
	
	public void setUploadedBy(User user) {
		this.uploadedBy = user;
	}
	
	public void setViewedBy(User user) { 
		viewedBy.add(user);
	}
}
