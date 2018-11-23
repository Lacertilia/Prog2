package RobotWars;

public class DarkRobot extends Robot {
    private char render = 'D';

    public DarkRobot(int pos){
        super(pos);
    }

    public char getRender(){
        return this.render;
    }
}
