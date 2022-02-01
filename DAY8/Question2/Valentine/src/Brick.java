import java.util.*;
class Brick{
    String content;
    ArrayList<String> commentList;
    User dedicatedTo;
    User owner;
    String message;
    boolean isPainted;
    //int paintedBricks;

    Brick(String content, User dedicatedTo, User owner, String message, boolean isPainted){
        this.content = content;
        this.message = message;
        this.dedicatedTo = dedicatedTo;
        this.owner = owner;
        this.isPainted = isPainted;

    }

    public void showComment(){
        for(String comment : commentList ){
            System.out.println(comment);
        }
    }

    public User getDedicatedTo(){
        return dedicatedTo;
    }

    public User getOwnerName(){
        return owner;
    }
    
    public String getMessage(){
        return message;
    }

    public boolean checkIsBrickPainted(){
        return isPainted;
    }

    public void editOwner(User newOwner){
        this.owner = newOwner;
    }

    public boolean brickIsPainted(){
        return isPainted;
    }
}