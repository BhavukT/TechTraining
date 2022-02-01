import java.util.*;

class City {
    private String name;
    private ArrayList<Walls> walls;

    City(ArrayList<Walls> walls, String name) {
        this.name = name;
        this.walls = walls;
    }

    public ArrayList<Walls> showWalls(){
        return walls;
    }

    public String getName(){
        return name;
    }

    public int totalWallsInitiated(){
        int count = 0;
        for(Walls iterator : walls){
            if(iterator.isInitiated()){
                count++;
            }
        }
        return count;
    }

}
