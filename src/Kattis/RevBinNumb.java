package Kattis;

import java.util.Scanner;

public class RevBinNumb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in, out = 0, count = 0;
        String bin1, bin2 = "";

            /*System.out.println("What number?");*/
            bin2 = "";
            count = 0;
            out = 0;
            in = scan.nextInt();
            bin1 = Integer.toBinaryString(in);
            /*System.out.println("" + bin1);*/
            for(int i = 1; i<=bin1.length(); i++){
                bin2 = bin2 + bin1.substring(bin1.length()-i, bin1.length()-i+1);
            }
            /*System.out.println("" + bin2);*/
            for(int i = bin2.length()-1; i>=0; i--){
                switch(bin2.charAt(i)){
                    case '1':
                        out += Math.pow(2, count);
                        count++;
                        break;
                    case '0':
                        count++;
                        break;
                }
            }
            System.out.println("" + out);

    }
}
