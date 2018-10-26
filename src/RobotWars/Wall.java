package RobotWars;

public class Wall extends Object {

    public Wall(int pos){
        super(pos);
        this.render = 'X';
    }

    @Override
    public boolean isSolid(){
        return true;
    }

    public char getRender(){
        return this.render;
    }

    public int getPosition(){
        return this.position;
    }
}
