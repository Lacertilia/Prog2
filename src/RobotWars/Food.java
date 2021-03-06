package RobotWars;

public class Food extends Object {
    private int value;

    public Food(int pos, int value){
        super(pos);
        this.value = value;
        this.render = 'B';
    }

    public boolean isSolid(){
        return false;
    }

    public int getValue(){
        return this.value;
    }

    public char getRender(){
        return this.render;
    }

    public int getPosition(){
        return this.position;
    }
}
