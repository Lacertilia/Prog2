package RobotWars;

public class Food extends Object {
    private int value;

    public Food(int pos, int value){
        super(pos);
        this.value = value;
        this.render = 'B';
    }

    public int getValue(){
        return this.value;
    }
}
