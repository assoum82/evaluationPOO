/**
 * Created by chawki on 20/11/16.
 */
public class Robot {


    //ATTRIBUT

    private String nom;
    private Position position;
    private Direction direction;


    //CONSTRUCTEUR

    public Robot() {
        this.nom = "none";
        this.position = new Position();
        this.direction = Direction.None;
    }

    public Robot(String nom) {
        this.nom = nom;
        this.position = new Position();
        this.direction = Direction.Nord;
    }

    public Robot(String nom, Position position, Direction direction) {

        this.nom = nom;
        this.position = position;
        this.direction = direction;
    }


    //GETTERS / SETTERS

    public Direction getDirection() {
        return direction;
    }

    public Position getPosition() {
        return position;
    }

    public String getNom() {
        return nom;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    //METHODE

    //pour avancer
    public void avance() {
        if (direction.equals(Direction.Nord)) {
            position.setY(position.getY() + 1);
        }

        if (direction.equals(Direction.Sud)) {
            position.setY(position.getY() - 1);
        }
    }


    //pour changer de direction
    public void droite() {
        switch (direction) {
            case None:
                break;
            case Nord:
                direction = Direction.Est;
                break;
            case Est:
                direction = Direction.Sud;
                break;
            case Sud:
                direction = Direction.Ouest;
                break;
            case Ouest:
                direction = Direction.Nord;
                break;
        }

    }

    public void affiche() {
        System.out.println("Robot: " + nom + " / Position : " + position + " / Direction : " + direction);
    }

    @Override
    public String toString() {
        return "Robot: " + nom + " / Position : " + position + " / Direction : " + direction;
    }
}
