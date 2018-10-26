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
        this.objects = new Object[size];
        this.places = new char[size];
        for(int i = 0; i < size; i++){
            if(i%columns == 0 || i%columns+1 == columns || i/rows == 0 || i/rows+1 == rows){
                objects[i] = new Wall(i);
                this.places[i] = objects[i].getRender();
            }else{
                this.places[i] = ' ';
            }
        }
    }

    private void generateWorld(){

    }

    public void tick(){

    }

    public char[] getBoard(){
        return this.places;
    }

    public void checkFood(){

    }

    public void placeFood(){

    }
}
