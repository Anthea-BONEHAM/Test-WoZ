public class Robot3H extends SuperRobot {

	public Robot3H(String name, int xPosition, int yPosition, Colour colour) {
    	super(name, xPosition, yPosition, colour);
	}

	public void moveRobot() {
        int newY = getYPosition() - 3;
        if (newY < 0) {
            newY = 11; // Essayez de revenir au bas si la position serait négative
        }
        
        // Vérifiez si la nouvelle position est occupée
        if (!getWorld().isPositionOccupied(getXPosition(), newY)) {
            setYPosition(newY);
            // Affichez le robot après le déplacement
            draw();
        }
        // Sinon, le robot reste à sa position actuelle
    }
}
