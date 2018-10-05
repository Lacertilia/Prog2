package Gammalt.Shapes;

public class Shape {
    private String color = "Red";
    private boolean filled = true;

    public Shape(){
        this.color = "Red";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        if(this.filled){
            return "A Shape with the color " + this.color + "and is filled";
        }else{
            return "A Shape with the color " + this.color + "and is not filled";
        }

    }
}
