package RobotWars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller implements Runnable{
    private Out out;
    private World world;
    private int fps = 1;
    private Thread thread;
    private boolean running = false;

    public Controller(int rows, int columns){
        world = new World(columns, rows);
        out = new Out(columns, rows);
    }

    public void run(){
        while(running){
            int ticks = 0;
            while(ticks<fps){
                update();
                ticks++;
            }
            draw();
            fps = 0;
            while(fps == 0){
                try{
                    fps = calcTicks();
                }catch(InputMismatchException e){
                    System.out.println("Enter a positive number.");
                    fps = 0;
                }
            }
        }
    }

    private void update(){
        world.tick();
    }

    private void draw(){
        out.output(world.getBoard());
    }



    private int calcTicks() throws InputMismatchException{
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(i<=0) i = 1;
        return i;
    }

    public synchronized void start(){
        if(!running){
            running = true;
            thread = new Thread(this);
            thread.start();
        }
    }

    public synchronized void stop(){
        if(running){
            running = false;
            try{
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
