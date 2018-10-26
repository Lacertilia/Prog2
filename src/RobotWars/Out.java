package RobotWars;

public class Out {
    private int rows;
    private int columns;

    public Out(int columns, int rows){
        this.columns = columns;
        this.rows = rows;
    }

    public void output(char[] p){
        for(int i = 0; i<rows; i++){
            for(int k = 0; k<columns; k++){
                System.out.println(p[(k+i*columns)]);
            }
            System.out.println("\n");
        }
    }
}
