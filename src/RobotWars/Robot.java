package RobotWars;

public abstract class Robot {
    private int pos;
    private int energy;
    private int cFood;
    private int targetPos;

    public Robot(int pos){
        this.pos = pos;
        this.energy = 10;
    }

    private void findFood(char[] w){
        boolean found = false;
        int i = 0;
        do{
            if(w[i] == 'B'){
                targetPos = i;
                found = true;
            }
            i++;

        }while(!found);
    }

    public void move(char[] w, int rows){
        if(targetPos == 0){
            findFood(w);
        }
        if(){
            
        }
    }

    private void update(){

    }

    private void idle(){

    }

    public abstract char getRender();
}
