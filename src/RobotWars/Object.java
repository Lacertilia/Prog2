package RobotWars;

public abstract class Object {
    private int position;
    private char render;

    public Object(int pos){
        if(pos>0){
            this.position = pos;
        }
    }

    public boolean isSolid(){
        return false;
    }
}
