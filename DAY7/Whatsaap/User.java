import java.util.*;
class User {
    private String name;
    private long phoneNumber;
    private String about;
    private ArrayList<User> contacts;
    private ArrayList<Status> myStatus;
    private ArrayList<Status> contactStatuses;
    private ArrayList<String> messages;

    User(String name, long phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.about = "Hello There";
        this.contacts = new ArrayList<>();
        this.contactStatuses = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public String getName() { 
		return name;
	}

	public long getMobileNumber() { 
		return phoneNumber;
	}
	
	public String getAbout() { 
		return about;
	}

	public ArrayList<User> getContacts() { 
		return contacts;
	}

	public ArrayList<Status> getStatuses() { 
		return myStatus;
	}
	
	public ArrayList<Status> getContactStatuses(){ 
		return contactStatuses;
	}

    public void addContacts(User contact){
        contacts.add(contact);
    }

    public void postStatus(Status status){
        myStatus.add(status);
    }

    public void chatwithPerson(String msg, User contact){
        messages.add(msg);
    }
    
}
