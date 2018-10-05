package Kattis;

import java.util.Scanner;

public class Apaxiaaaans {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.next(), output = "";
        char lookingAt, nextChar, lastOut;

        for(int i = 0; (i+1)<in.length(); i++){
            lookingAt = in.charAt(i);
            nextChar = in.charAt((i+1));
            if(lookingAt == nextChar){
                if(i == 0){
                    output += lookingAt;
                }else if(output.charAt((output.length()-1)) != lookingAt){
                    output += lookingAt;
                }
            }else{
                output = output + nextChar;
            }
        }
        lookingAt = in.charAt(in.length()-1);
        nextChar = in.charAt((in.length()-2));
        if(lookingAt == nextChar){
            if(output.charAt((output.length()-1)) != lookingAt){
                output += lookingAt;
            }
        }else{
            output = output + lookingAt;
        }

        System.out.println(output);
    }
}
