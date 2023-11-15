/**
 * Décrivez votre classe RobotBas ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class RobotBas extends SuperRobot
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private static final int MAX_X = 11;
    private static final int MIN_X = 0;
    private static final int MAX_Y = 11;
    private static final int MIN_Y = 0;

    /**
     * Constructeur d'objets de classe RobotBas
     */
    public RobotBas(String name)
    {
        super (name);
    }
    
    public RobotBas(String name, int xPosition, int yPosition, Colour colourBody)
    {
        // initialisation des variables d'instance
        super (name, xPosition, yPosition, colourBody);
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    @Override
    public void moveRobot() {
        if (getDrawable()) {
            int newYPosition = getYPosition() + 2;
            if (newYPosition > MAX_Y) {
                newYPosition = MIN_Y; // Essayez de revenir à l'opposé 
            }

            // Vérifiez si la nouvelle position est occupée
            if (!getWorld().isPositionOccupied(getXPosition(), newYPosition)) {
                setYPosition(newYPosition);
                // Affichez le robot après le déplacement 
                draw();
            }
            // Sinon, le robot reste à sa position actuelle
        }
    }
}
