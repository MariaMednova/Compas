package Pef_lab;

public enum WorldPart {
    NE ("ne", 45),
    EAST ("east", 90),
    SE ("se", 135),
    SOUTH ( "south", 180),
    SW ("sw", 225),
    WEST ("west", 270),
   NW ("nw", 315),
    NORTH ("north", 360);

    String partWorld;
    int degree;

    private WorldPart (String partWorld,int degree){
        this.partWorld=partWorld;
        this.degree=degree;
    }
}
