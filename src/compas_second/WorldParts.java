package compas_second;public enum WorldParts {

    NORTHEAST ( 45),
    EAST ( 90),
    SOUTHEAST (135),
    SOUTH (  180),
    SOUTHWEST (225),
    WEST (270),
    NORTHWEST (315),
    NORTH (0);

    int degree;

    private WorldParts ( int degree){

        this.degree=degree;
    }

}
