package Kryptering;

public class BitWiseCoord {
    private short xy;

    public BitWiseCoord(int x, int y){
        if(x<=200 && x>=0 && y<=200 && y>=0){
            this.setHigh(x);
            this.setLow(y);
        }else{
            System.out.println("Vänligen skriv in en koordinat mellan (0, 0) och (200, 200)");
        }
    }

    public void setHigh(int x){
        short a = (short) x;
        if(a<=200 && a>=0){
            if(this.xy<256){
                this.xy += (a<<8);
            }else{
                this.xy = (short)(this.getLow() + (a<<8));
            }
        }else{
            System.out.println("Vänligen skriv in ett tal mellan 0-200");
        }

        System.out.println(Integer.toBinaryString(this.xy));
    }

    public void setLow(int y){
        if(y>=0 && y<=200){
            if(this.getLow() == 0){
                this.xy += y;
            }else{
                this.xy = (short)(this.getHigh()<<8 + y);
            }
        }else{
            System.out.println("Vänligen skriv in ett tal mellan 0-200");
        }

        System.out.println(Integer.toBinaryString(this.xy));
    }

    public int getHigh(){
        String x = Integer.toBinaryString(Integer.parseInt(Short.toString(((short)(xy>>>8)))));
        //x = x.substring(0, x.length()-8);
        int o = 0;
        System.out.println("x:" + x);
        if(!x.equals("0")){
            for(int i = 0; i<x.length(); i++){
                o += (Integer.parseInt(Character.toString(x.charAt(i))))*Math.pow(2, (x.length()-1-i));
            }
        }

        System.out.println(Integer.toBinaryString(this.xy));

        return o;
    }

    public int getLow(){
        String y = Integer.toBinaryString(Integer.parseInt(Short.toString(xy)));
        if(y.length() > 8){
            y = y.substring(y.length()-8);
        }
        int o = 0;
        System.out.println("y:" + y);
        for(int i = 0; i<y.length(); i++){
            o += (Integer.parseInt(Character.toString(y.charAt(i))))*Math.pow(2, (7-i));
        }

        System.out.println(Integer.toBinaryString(this.xy));

        return o;
    }


    public String toString(){
        return "(" + this.getHigh() + ", " + this.getLow() + ")";
    }


    public static void main(String[] args) {
        BitWiseCoord bWCTest = new BitWiseCoord(100, 20);

        System.out.println(bWCTest.toString());

        bWCTest.setHigh(200);
        bWCTest.setLow(92);
        System.out.println(bWCTest.toString());

        bWCTest.setHigh(201);
        bWCTest.setLow(-1);
        System.out.println(bWCTest.toString());

        bWCTest.setHigh(22);
        bWCTest.setLow(34);
        System.out.println(bWCTest.toString());
    }
}
