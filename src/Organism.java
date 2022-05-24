public class Organism implements Movable {
    private int x;
    private int y;
    private int dx;
    private int dy;

    public Organism(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

    @Override
    public String toString(){
        return "x: " + getX() + "; " + "y: " + getY();
    }

    public void move(int dx, int dy){
        this.dx = dx;
        this.dy = dy;

        x += dx;
        y += dy;
    }
    
}
