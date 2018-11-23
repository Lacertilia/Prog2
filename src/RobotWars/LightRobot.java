package RobotWars;

public class LightRobot extends Robot {
    private char render = 'R';

    public LightRobot(int pos){
        super(pos);
    }

    public char getRender(){
        return this.render;
    }
}
