import java.util.*;
public class User {
	private String name; 
	private Country country; 
	private City city; 
	private ArrayList<Brick> ownedBricks; 
	private ArrayList<Brick> dedicatedBricks; 
	
	User(String name, Country country, City city){ //Constructor
		this.name = name;
		this.country = country;
		this.city = city;
		this.ownedBricks = new ArrayList<Brick>();
		this.dedicatedBricks = new ArrayList<Brick>();
	}
	
	public void addBrick(Brick brick) { 
		ownedBricks.add(brick);
	}
	
	public String getName() { 
		return name;
	}
	
	public Country getCountry() { 
		return country;
	}
	
	public City getCity() { 
		return city;
	}
	
	public ArrayList<Brick> getBricks() { 
		return ownedBricks;
	}
	
	public void makeBrick(String content, User dedicatedTo, User owner, String message){
        Brick brick = new Brick(content, dedicatedTo, owner, message, true);
        ownedBricks.add(brick);
        dedicatedBricks.add(brick);
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
	
	public ArrayList<Brick> getDedicatedBricks(){ 
		return dedicatedBricks;
	}
	
	public void addDedicatedBrick(Brick brick) { 
		dedicatedBricks.add(brick);
	}
	
	public void removeDedicatedBrick(Brick brick) { 
		dedicatedBricks.remove(brick);
	}
}
