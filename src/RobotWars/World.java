package RobotWars;

public class World {

    private int size;
    private int[] light;
    private char[] places;
    private Robot[] robots;
    private Object[] objects;
    private int rows;
    private int columns;

    public World(int columns, int rows){
        this.rows = rows;
        this.columns = columns;
        this.size = columns * rows;
        for(int i = 0; i<size; i++){
            if(i<rows){
               this.places[i] = 'X';
            }
        }
    }

    private void generateWorld(){

    }

    public void tick(){

    }

    public char[] getBoard(){
        return places;
    }

    public void checkFood(){

    }

    public void placeFood(){

    }
}
