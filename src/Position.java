/**
 * Created by chawki on 20/11/16.
 */
public class Position {

    //ATTRIBUT
    private int x;
    private int y;

    //CONSTRUCTEUR
    public Position() {
        this.x = 0;
        this.y = 0;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //GETTERS / SETTERS
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //METHODE
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
