package RobotWars;

public abstract class Object {
    protected int position;
    protected char render;

    public Object(int pos){
        if(pos>0){
            this.position = pos;
        }
    }

    public boolean isSolid(){
        return false;
    }
}
