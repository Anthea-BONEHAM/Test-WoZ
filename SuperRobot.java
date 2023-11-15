public abstract class SuperRobot {

    private String name;
    private int xPosition;
    private int yPosition;
    private static int numberOfUnnamedRobots = 0;
    private CanvasRobot canvas;
    private Colour colour;
    private boolean OKdrawable=false;
    private static final int MIN_NAME_LENGTH = +3;
    protected World world;
    public SuperRobot(String name) {
    setName(name);
    this.xPosition = 0;
    this.yPosition = 0;
    }

    public SuperRobot(String name, int xPosition, int yPosition, Colour colourBody) {
    setName(name);
    setXPosition(xPosition);
    setYPosition(yPosition);
    this.colour = colourBody; // Utilisez la couleur spécifiée lors de la création
    }

    public void draw(){
        canvas.drawRobot(xPosition, yPosition);
    }
    
    
    public void setDrawable(boolean is){
        OKdrawable=is;
    }
    
    public String getName() {
        return name;
    }
    
     public boolean getDrawable(){
        return OKdrawable;
    }
    
    public CanvasRobot getCanvas(){
        return canvas;
    }

    public void setCanvas() {
    if (colour != null) { // Assurez-vous que la couleur est définie
        canvas = new CanvasRobot(colour.toString());
    } else {
        // Gérez le cas où la couleur n'est pas définie, par exemple en utilisant une couleur par défaut.
        canvas = new CanvasRobot("DEFAULT_COLOR");
    }
    }
    
    public void setXPosition(int x){
        this.xPosition=x;
    }
    
    public void setYPosition(int y){
        this.yPosition=y;
    }
    
    public World getWorld(){
        return world;
    }

    public void setName(String name) {
        if(name != null) {
            String trimmedName = name.trim();
            if (trimmedName.length() >= MIN_NAME_LENGTH) {
                this.name = trimmedName;
            }
            if (trimmedName.length() >= MIN_NAME_LENGTH) {
                    this.name = trimmedName;
                    return;
                }
        
        numberOfUnnamedRobots++;
        this.name = "iRobot" + numberOfUnnamedRobots;
        }
    }
    
    public int getYPosition(){
        return yPosition ;
    }
    public int getXPosition(){
        return xPosition;
    }
    
      public void setWorld(World world) {
        this.world = world;
    }
    
    public Colour getColour() {
        return colour;
    }
   
    public void setColour(Colour colour) {
        this.colour = colour;
    }
    
    public abstract void moveRobot();
}
