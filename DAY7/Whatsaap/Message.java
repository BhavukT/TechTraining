import java.util.*;

public class Message {
	private String content; 
	private User sender; 
	private User receiver; 
	private Date dateAndTime; 
	private String type; 
	private boolean seen; 
	private boolean delivered; 
	
	Message(String content, String type, Date dateAndTime){  
		this.content = content;
		this.type = type;
		this.dateAndTime = dateAndTime;
		this.delivered = true;
		this.seen = false;
	}

	public String getContent() { 
		return content;
	}

	public User getSender() { 
		return sender;
	}

	public User getReceiver() { 
		return receiver;
	}
	
	public void setSender(User sender) {
		this.sender = sender;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}
	
	public Date getDateAndTime() { 
		return dateAndTime;
	}

	public String getType() { 
		return type;
	}
	
	public void seeMessage() {
		this.seen = true;
	}

}
