import java.util.*;
public class Admin extends User{
    String name;

    Admin(String name){
        this.name = name;
    }

    public void editCaption(Brick brick, String newCaption){
        brick.content = newCaption;
    }

    public void editMessage(Brick brick, String newMessage){
        brick.message = newMessage;
    }

    public void editDedicatedUser(Brick brick, User newUser){
        brick.dedicatedTo = newUser;
    }
}