import java.util.ArrayList;

/**
 * Created by chawki on 20/11/16.
 */
public class Main {

    public static void main(String[] args) {


        ArrayList<Robot> listeRobot = new ArrayList<>();

        //creation des robot
        Robot robot1 = new Robot("R2D2");
        Robot robot2 = new Robot("BB-8", new Position(), Direction.Sud);
        RobotNG robot3 = new RobotNG("C-3PO");
        RobotNG robot4 = new RobotNG("C17", new Position(0, 1), Direction.Nord);


        //affection dans le tab
        listeRobot.add(robot1);
        listeRobot.add(robot2);
        listeRobot.add(robot3);
        listeRobot.add(robot4);


        //appel de quelque methode
        robot1.avance();

        robot2.droite();

        robot3.activeTurbo();
        robot3.avance(2);

        robot4.demiTour();

        //afficher les robot
        for (int i = 0; i < listeRobot.size(); i++) {
            System.out.println(listeRobot.get(i));
        }

    }
}
