package RobotWars;

public class Light extends Object {
    private int radius;

    public Light(int radius, int pos){
        super(pos);
        this.radius = radius;
        this.render = 'L';
    }

    public char getRender(){
        return this.render;
    }

    public int getPosition(){
        return this.position;
    }
}
