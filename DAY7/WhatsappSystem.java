// Create a whats app as following 
// Users having contacts and can chat with any contact
// Messaging in text audio and video 
// Users can see status of all the contacts
// User can post status
// Status can be text and image

class WhatsappSystem {
    public void postStatus(String type, String message){
        this.type = type;
        this.message = message;
    }
     public void sendMessage(String type, String message, double pNumber){
        System.out.println("Message Sent 🔃");
     }
}

class User extends WhatsappSystem {
    
}
