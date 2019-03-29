package Kryptering;

import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean notSet = true;
        boolean fileSet = false;
        String fileName = "";

        System.out.println("Binary or Text?");
        String method = scan.next();

        if(method.equalsIgnoreCase("Binary")){
            notSet = false;
            System.out.println("Vad heter dokumentet?");
            fileName = scan.next();
            binaryCopy(fileName);
        }else if(method.equalsIgnoreCase("Text")){
            notSet = false;
            System.out.println("Vad heter dokumentet?");
            fileName = scan.next();
            textCopy(fileName);
        }

    }

    private static void binaryCopy(String name){

    }

    private static void textCopy(String name){

    }
}
