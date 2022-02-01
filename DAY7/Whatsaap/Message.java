import java.util.*;

public class Message {
	private String content;  //Content of the message
	private User sender;  //Sender of the message
	private User receiver; // Receiver of the message
	private Date dateAndTime; //DateAndTime of the message
	private String type; //Type of the message
	private boolean seen; // Is the message is seen or not
	private boolean delivered; // Is the mesage is delivered or not
	
	
	Message(String content, String type, Date dateAndTime){  // Constructor
		this.content = content;
		this.type = type;
		this.dateAndTime = dateAndTime;
		this.delivered = true;
		this.seen = false;

	}

	public String getContent() {  // Get content of the message 
		return content;
	}

	public User getSender() { // Get sender of the message
		return sender;
	}

	public User getReceiver() { // Get receiver of the message
		return receiver;
	}
	
	public void setSender(User sender) {
		this.sender = sender;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}
	
	public Date getDateAndTime() { // get Date and Time of The message
		return dateAndTime;
	}

	public String getType() { // type of the message
		return type;
	}
	
	public void seeMessage() { // Is message seen or not
		this.seen = true;
	}

	public boolean isMessageDelivered(){ // Is The message is delivered or not
		return delivered;
	}

}
