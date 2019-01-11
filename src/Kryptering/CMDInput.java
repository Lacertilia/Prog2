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
                }catch(NumberFormatException e){
                    System.out.println("Oof");
                    System.exit(2);
                }
                break;
            case 3:
                for(int i = args.length - 1; i>=0; i--){
                    System.out.println(args[i]);
                }
                break;
            default:
                System.out.println("Vill inte!");
                break;
        }

    }
}
