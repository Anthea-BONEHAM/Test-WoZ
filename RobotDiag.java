public class RobotDiag extends SuperRobot {

	public RobotDiag(String name, int xPosition, int yPosition,Colour colourBody) {
    	super(name, xPosition, yPosition,colourBody);
	}

	@Override
	public void moveRobot() {
        int newX = getXPosition() + 1;
        int newY = getYPosition() - 1;
        
        if (newY < 0) {
            newY = 11; // Essayez de revenir au haut si la position Y serait négative
        }
        
        if (newX > 11) {
            newX = 0; // Essayez de revenir à la gauche si la position X serait trop grande
        }

        // Vérifiez si la nouvelle position est occupée
        if (!getWorld().isPositionOccupied(newX, newY)) {
            setXPosition(newX);
            setYPosition(newY);
            // Affichez le robot après le déplacement
            draw();
        }
        // Sinon, le robot reste à sa position actuelle
    }
}
