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
        this.robots = new Robot[2];
        this.generateWorld();

    }

    private void generateWorld(){
        for(int i = 0; i < size; i++){
            if(i%columns == 0 || i%columns+1 == columns || i/rows == 0 || i/rows+1 == rows){
                objects[i] = new Wall(i);
                this.places[i] = objects[i].getRender();
            }else{
                this.places[i] = ' ';
            }
        }
        this.placeFood();
        this.placeFood();
        int r;
        boolean set = false;
        do{
            r = (int) (Math.random() * size);

            if(this.places[r] != ' '){

            }else{
                robots[0] = new DarkRobot(r);
                this.places[r] = robots[0].getRender();
                set = true;
            }
        }while(!set);
        do{
            set = false;
            r = (int) (Math.random() * size);

            if(this.places[r] != ' '){

            }else{
                robots[1] = new LightRobot(r);
                this.places[r] = robots[1].getRender();
                set = true;
            }
        }while(!set);
    }

    public void tick(){
        for(int i = 0; i<robots.length; i++){
            robots[i].move(places, rows);
        }
    }

    public char[] getBoard(){
        return this.places;
    }

    public void checkFood(){
        boolean food = false;
        for(int i = 0; i<this.size; i++) {
            if (this.places[i] == 'B') {
                food = true;
            }
        }
        if(!food){
            placeFood();
        }
    }

    public void placeFood(){
        int p;
        do{
            p = (int) (Math.random() * size);
            if(this.places[p] != ' '){

            }else{
                objects[p] = new Food(p, 70);
                places[p] = objects[p].getRender();
            }
        }while(p%columns == 0 || p%columns+1 == columns || p/rows == 0 || p/rows+1 == rows);
    }
}
