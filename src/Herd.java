import java.util.*;

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    public void move(int dx, int dy){
        for(Movable org : herd){
            org.move(dx, dy);
        }


    }
    
     /*@Override
    public String toString(){
        for(Movable org : herd){
        return "x: " + dx.move() + "; " + "y: " + dy;
        }
    }*/

    
}
