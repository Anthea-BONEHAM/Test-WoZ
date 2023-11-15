public class RobotDroite extends SuperRobot {

    public RobotDroite(String name) {
        super(name);
    }

    public RobotDroite(String name, int xPosition, int yPosition, Colour colour) {
        super(name, xPosition, yPosition, colour);
    }
    
    @Override
    public void moveRobot() {
        // Calculer la nouvelle position
        int newXPosition = getXPosition() + 1;

        // Si le robot est sur le bord droit
        if (newXPosition > 11) {
            newXPosition = 0; // Essayez de revenir à l'opposé 
        }

        // Vérifiez si la nouvelle position est occupée
        if (!getWorld().isPositionOccupied(newXPosition, getYPosition())) {
            setXPosition(newXPosition);
            // Affichez le robot après le déplacement 
            draw();
        }
        // Sinon, le robot reste à sa position actuelle (vous pouvez ajouter d'autres comportements si nécessaire, comme changer de direction ou s'arrêter)
    } 
}
