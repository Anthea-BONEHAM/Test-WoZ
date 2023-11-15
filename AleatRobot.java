import java.util.Random;

public class AleatRobot extends SuperRobot {
    private Random random;
    private static final int MAX_X = 11;
    private static final int MIN_X = 0;
    private static final int MAX_Y = 11;
    private static final int MIN_Y = 0;

    public AleatRobot(String name) {
        super(name);
        this.random = new Random();
    }

    public AleatRobot(String name, int xPosition, int yPosition, Colour colourBody) {
        super(name, xPosition, yPosition, colourBody);
        this.random = new Random();
    }

    @Override
    public void moveRobot() {
        int direction = random.nextInt(4);
        int newX = getXPosition();
        int newY = getYPosition();
        switch(direction) {
            case 0: // Up
                newY--;
                if (newY < MIN_Y) {
                    newY = MAX_Y;
                }
                break;
            case 1: // Down
                newY++;
                if (newY > MAX_Y) {
                    newY = MIN_Y;
                }
                break;
            case 2: // Left
                newX--;
                if (newX < MIN_X) {
                    newX = MAX_X;
                }
                break;
            case 3: // Right
                newX++;
                if (newX > MAX_X) {
                    newX = MIN_X;
                }
                break;
        }
        
        if (!getWorld().isPositionOccupied(newX, newY)) {
            setXPosition(newX);
            setYPosition(newY);
            this.draw();
        }
    }
}

