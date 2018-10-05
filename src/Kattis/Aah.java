package Kattis;

import java.util.Scanner;

public class Aah {
    public static void main(String[] args) {
        String jon;
        String doc;
        Scanner scan = new Scanner(System.in);
        jon = scan.next();
        doc = scan.next();
        if(jon.length()>=doc.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
