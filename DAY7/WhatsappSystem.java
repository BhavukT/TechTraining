// Create a whats app as following 
// Users having contacts and can chat with any contact
// Messaging in text audio and video 
// Users can see status of all the contacts
// User can post status
// Status can be text and image

class Contacts extends WhatsappSystem {
    long pNumber;

    Contacts(long pNumber) {
        this.pNumber = pNumber;
    }

    bool isContactAvailable(long fNumber, long pNumber){
        return true;
    }
}

class Message extends WhatsappSystem {
    public String type = " ";

    Message(){

    }

    public void sendMessage(String type, String message, double pNumber){
        if(type == "Text"){
            System.out.println("Text Message - " + message);
        }
        else if(type == "MP3"){
            system.out.println("MP3 Message - " + message);
        }
        else if(type == "MP4"){
            System.out.println("MP4 Message - " + message);
        }
    }    
}

class Status extends WhatsappSystem{
    public String type = " ";

    Status(){

    }

    public void postStatus(String type, String message){
        if(type == "Text"){
            System.out.println("Text Status - " + message);
        }
        else if(type == "MP3"){
            system.out.println("MP3 Status - " + message);
        }
        else if(type == "MP4"){
            System.out.println("MP4 Status - " + message);
        }
    }  
}

class WhatsappSystem {
    WhatsappSystem(){
        
    }
}

class User extends WhatsappSystem {
    double pNumber;

    public double getNumber(){
        return pNumber;
    }
    User(double pNumber){
        this.pNumber = pNumber;
    }
}
