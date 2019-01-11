package Kattis;

import java.util.Scanner;

public class Apaxiaaaans {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in, out = "";
        in = scan.next();
        String inM = in;

        for(int i = 0; i<in.length(); i++){
            if(inM.length() > 1 && inM.charAt(0) == inM.charAt(1)){
                boolean hasNext = true;
                for(int k = 1;hasNext; k++){
                    if(k+1 <inM.length() && inM.charAt(k) != inM.charAt(k+1)){
                        hasNext = false;
                        out += inM.charAt(0);
                        inM = inM.substring(k+1);
                    }else if(k+1 == inM.length()){
                        hasNext = false;
                        out += inM.charAt(0);
                        inM = "";
                        i = in.length();
                    }
                }
            }else if(inM.length() == 1){
                out += inM;
                i = in.length();
            }else{
                out += inM.charAt(0);
                inM = inM.substring(1);
            }
        }

        System.out.println("" + out);
    }
}
