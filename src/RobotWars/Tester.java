package RobotWars;

public class Tester {
    public static void main(String[] args) {
        World w = new World(50, 50);
        Out o = new Out(50, 50);


        o.output(w.getBoard());
        w.checkFood();

    }
}
