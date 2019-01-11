package Kryptering;

public class CMDInput {
    public static void main(String[] args) {
        switch(args.length){
            case 0:
                System.out.println("Inga Argument");
                break;
            case 1:
                System.out.println("Så du säger " + args[0]);
                break;
            case 2:
                try{
                    int i = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
                }catch(){

                }
        }
    }
}
