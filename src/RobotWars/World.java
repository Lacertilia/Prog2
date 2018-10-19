package RobotWars;

public class World {

    private int size;
    private char[] light;
    private char[] places;
    private Robot[] robots;
    private Object[] objects;
    private Out out;
    private int rows;
    private int columns;

    public World(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.size = columns * rows;
    }

    private void generateWorld(){

    }

    private void tick(){

    }
}
