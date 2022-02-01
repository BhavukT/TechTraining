import java.util.*;
public class Walls {
    private final int maxBrick = 90;
    ArrayList<Brick> bricks;
    String name;
    boolean flag;

    Walls(String name, ArrayList<Brick> bricks) {
        this.name = name;
        this.bricks = new ArrayList<Brick>();
    }

    //addBrick
    public void addBrick(Brick brick){
        this.bricks.add(brick);
    }

    public boolean isInitiated(){
        int count = 0;
        for(Brick brick : bricks){
            if(brick.brickIsPainted()){
                count++;
            }
        }
        if(count > maxBrick){
            System.out.println("Space left");
            return true;
        }
        System.out.println("Please use second wall");
        return false;
    }

    public int totalNumberOfBricksInitiated(){
        int count = 0;
        for(Brick brick : bricks){
            if(brick.brickIsPainted()){
                count++;
            }
        }
        return count;
    }
}
