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
        if(pos%(w.length/rows) < targetPos){
            pos++;
        }
        if(pos%(w.length/rows) > targetPos){
            pos--;
        }
        if(pos/rows < targetPos){
            pos+=(w.length/rows);
        }
        if(pos/rows > targetPos){
            pos-=(w.length/rows);
        }
    }

    private void update(){

    }

    private void idle(){

    }

    public abstract char getRender();

    public int getPos(){
        return this.pos;
    }

    public int getTargetPos(){
        return this.targetPos;
    }

    public void setTargetPos(){
            targetPos = 0;

    }
}
