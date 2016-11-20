/**
 * Created by chawki on 20/11/16.
 */
public class RobotNG extends Robot {

    private boolean turbo;

    public boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public RobotNG() {
        super();
        turbo = false;
    }

    public RobotNG(String nom) {
        super(nom);
        turbo = false;
    }

    public RobotNG(String nom, Position position, Direction direction) {
        super(nom, position, direction);
        turbo = false;
    }


    //METHODE

    //pour avancer v1
    public void avance(int nombreDePas) {
        for (int i = 0; i < nombreDePas; i++) {
            avance();
        }
    }

    //pour avancer v2
    public void avance2(int nombreDePas) {

        if (turbo) {
            nombreDePas = nombreDePas * 3;
        }
        if (getDirection().equals(Direction.Nord)) {
            getPosition().setY(getPosition().getY() + nombreDePas);
        }
        if (getDirection().equals(Direction.Sud)) {
            getPosition().setY(getPosition().getY() - nombreDePas);
        }
    }


    //pour tourner a gauche v1
    public void gauche() {
        for (int i = 0; i < 3; i++) {
            droite();
        }
    }

    //pour tourner a gauche v2
    public void gauche2() {
        switch (getDirection()) {
            case None:
                break;
            case Nord:
                setDirection(Direction.Ouest);
                break;
            case Est:
                setDirection(Direction.Nord);
                break;
            case Sud:
                setDirection(Direction.Est);
                break;
            case Ouest:
                setDirection(Direction.Sud);
                break;
        }
    }


    //faire demi tour v1
    public void demiTour() {

        for (int i = 0; i < 2; i++) {
            droite();
        }
    }

    //faire demi tour v2
    public void demiTour2() {
        if (getDirection().equals(Direction.Nord)) {
            setDirection(Direction.Sud);
        }

        if (getDirection().equals(Direction.Sud)) {
            setDirection(Direction.Nord);
        }

    }

    //active le turbo
    public void activeTurbo() {
        turbo = true;
    }

    //desactive le turbo
    public void desactiveTurbo() {
        turbo = false;
    }

    @Override
    public String toString() {
        if (turbo) {
            return super.toString() + " / Turbo is ON";
        } else {
            return super.toString() + " / Turbo is OFF";
        }
    }

    @Override
    public void affiche() {
        if (turbo) {
            super.affiche();
            System.out.println(" Turbo is ON");

        } else {
            super.affiche();
            System.out.println(" Turbo is OFF");
        }

    }
}
