package RobotWars;

public class Tester {
    private static int r = 10;
    private static int c = 10;

    public static void main(String[] args) {
        World w = new World(c, r);
        Out o = new Out(c, r);


        o.output(w.getBoard());
        for(int i = 0; i<10; i++){
            w.tick();
            o.output(w.getBoard());
        }


    }
}
