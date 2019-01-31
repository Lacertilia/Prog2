package Garb;

public class FindJutsu {
    public static void main(String[] args) {
        String in = ""; // Add all jutsus
        String[] inList = in.split("\n");
        String jutsu = ""; //Current with capital start letter
        String jutsu1 = ""; //Current with lower start letter
        String system1 = ""; //Current system (Mon or Kyu and Dan)
        String system2 = ""; //2nd Current system (For Dan)
        String out = "";
        out += "{";
        boolean first = true;

        for(int i = 0; i<inList.length; i++){
            if((inList[i].contains(jutsu) || inList[i].contains(jutsu1)) && (inList[i].contains(system1) || inList[i].contains(system2))){
                if(first){
                    first = false;
                    out = out + (i+1);
                }else{
                    out = out + ", " + (i+1);
                }
            }
        }

        out += "}";


        System.out.println(out);
    }
}
