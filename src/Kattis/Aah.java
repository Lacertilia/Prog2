package Kattis;

import java.util.Scanner;

public class Aah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String jon;
        String doc;
        jon = scan.next();
        doc = scan.next();
        if(jon.length()>=doc.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
