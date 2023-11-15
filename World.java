import java.util.ArrayList;

public class World {
    private ArrayList<SuperRobot> sur_carte;

    public World() {
        sur_carte = new ArrayList<>();
    }

    public void addRobot(SuperRobot robot) {
        boolean OK = true;
        for (SuperRobot r : sur_carte) {
            if (r == robot || isPositionOccupied(robot.getXPosition(), robot.getYPosition())) {
                OK = false;
                break;  // Si le robot existe déjà ou si sa position est déjà occupée, sortir de la boucle
            }
        }
        if (OK) { 
            sur_carte.add(robot);
            robot.setCanvas();
            robot.setWorld(this);
            robot.setDrawable(true);
            robot.draw();
        }
    }
    
    public boolean isPositionOccupied(int x, int y) {
    for (SuperRobot robot : sur_carte) {
        if (robot.getXPosition() == x && robot.getYPosition() == y) {
            return true;
        }
    }
    return false;
    }

    public void moveAllRobots() {
    for (SuperRobot robot : sur_carte) {
        robot.moveRobot();
    }
    }


}
