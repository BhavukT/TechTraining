// Create a whats app as following 
// Users having contacts and can chat with any contact
// Messaging in text audio and video 
// Users can see status of all the contacts
// User can post status
// Status can be text and image

import java.util.*;

class Message {
    public String type = " ";

    Message() {

    }

    public void sendMessage(String type, String message, double pNumber) {
        if (type == "Text") {
            System.out.println("Text Message - " + message);
        } else if (type == "MP3") {
            System.out.println("MP3 Message - " + message);
        } else if (type == "MP4") {
            System.out.println("MP4 Message - " + message);
        }
    }
}

class WhatsappSystem  {
    User user;
    WhatsappSystem() {

    }
}



class chatWindow{
    boolean seenMsg = false;
    ArrayList<Message> msg = new ArrayList<Message>();
    chatWindow(ContactUser contactUser){
        public void getAllMessage(contactUser.chatId){
            //Search for contact in contact list and show previous message
            seenMsg = true;

        }
    }
}

class ContactUser{
    int chatId;
    ContactUser(int chatId, UserDetails userDetails){
        this.chatId = chatId;
        this.userDetails = userDetails;
    }
}

class UserDetails{
    String username;
    String age;
    String gender;

}


