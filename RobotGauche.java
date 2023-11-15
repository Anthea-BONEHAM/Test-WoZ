public class RobotGauche extends SuperRobot {

        private static final int MAX_X = 11;
    private static final int MIN_X = 0;
    
    public RobotGauche(String name) {
        super(name);
    }

    public RobotGauche(String name, int xPosition, int yPosition, Colour colourBody) {
        super(name, xPosition, yPosition, colourBody);
    }

    @Override
  public void moveRobot() {
        if (getDrawable()) {
            int newXPosition = getXPosition() - 1;

            // Si le robot est sur le bord gauche
            if (newXPosition < MIN_X) {
                newXPosition = MAX_X; // Essayez de revenir à l'opposé 
            }

            // Vérifiez si la nouvelle position est occupée
            if (!getWorld().isPositionOccupied(newXPosition, getYPosition())) {
                setXPosition(newXPosition);
                // Affichez le robot après le déplacement 
                draw();
            }
            // Sinon, le robot reste à sa position actuelle
        }
    }
}