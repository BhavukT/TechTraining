import java.util.*;
class User {
    private String name;
    private long phoneNumber;
    private String about;
    private ArrayList<User> contacts;
    private ArrayList<Status> myStatus;
    private ArrayList<Status> contactStatuses;
    private ArrayList<String> messages;
	private ArrayList<String> messageHistory;

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

    public void chatwithPerson(String msg, User contact){
        messages.add(msg);
    }
    public void UserDetails(){
        System.out.println("Name " + name);
        System.out.println("Phone Number " + phoneNumber);
        System.out.println("About" + about);
        //My Status
        for(Status status : myStatus){
            System.out.println("Status" + status);
        }
    }

    public void addContact(User contact) { 
		contacts.add(contact);
	}
	
	public void postStatus(Status status){ 
		status.setUploadedBy(this);
		myStatus.add(status);
		ArrayList<User> contacts = this.getContacts();
		for(User contact: contacts) {
			contact.addContactStatus(status);
		}
	}
	
	public void addContactStatus(Status status) { 
		this.contactStatuses.add(status);
	}
	
	public void chatWithContact(User contact, Message message, String messageContent) { 
		message.setSender(this);
		message.setReceiver(contact);
		messageHistory.add(messageContent);
	}
	
	public void viewStatus(User contact, Status status) { 
		Status currentStatus = contact.getStatuses().get(contact.getStatuses().indexOf(status));
		currentStatus.setViewedBy(this);
	}
	
	public void readMessage(Message message) {
		message.seeMessage();
	}
    
}
