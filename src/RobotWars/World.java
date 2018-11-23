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

            if(this.places[r] == ' '){
                robots[0] = new DarkRobot(r);
                this.places[r] = robots[0].getRender();
                set = true;
            }
        }while(!set);
        set = false;
        do{

            r = (int) (Math.random() * size);

            if(this.places[r] == ' '){
                robots[1] = new LightRobot(r);
                this.places[r] = robots[1].getRender();
                set = true;
            }


        }while(!set);
    }

    public void tick(){
        for(int i = 0; i<robots.length; i++){
            robots[i].move(places, rows);
            if(robots[i].getPos() == robots[i].getTargetPos()){
                for(int k = 0; k<robots.length; k++){
                    robots[k].setTargetPos();
                }
            }
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
        boolean set = false;
        do{
            p = (int) (Math.random() * size);
            if(this.places[p] == ' '){
                objects[p] = new Food(p, 70);
                places[p] = objects[p].getRender();
                set = true;
            }
        }while(!set);
    }
}
