package RobotWars;

public class Out {
    private int rows;
    private int columns;
    /**
     * Creator for Out class, sets rows and columns.
     *
     */
    public Out(int columns, int rows){
        this.columns = columns;
        this.rows = rows;
    }

    /**
     * Prints the world.
     * @param p is char[] of World.
     */
    public void output(char[] p){
        for(int i = 0; i<this.rows; i++){
            String out = "";
            for(int k = 0; k<this.columns; k++){
                out = out + p[k+i*columns] + " ";
            }
            System.out.println(out);
        }
    }
}
