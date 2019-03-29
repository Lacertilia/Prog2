package Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 1234;
        ServerSocket serverSocket;
        Socket socket;
        System.out.println("Server Started.");
        try{
            serverSocket = new ServerSocket(port);
            while(true){
                System.out.println("Waiting for connection!");
                socket = serverSocket.accept();

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("Client Connected");

                String name = in.readLine();
                if(name.equalsIgnoreCase("Shutdown")){
                    out.println("You disconnected me.");
                    in.close();
                    out.close();
                    socket.close();
                    System.out.println("Server shutting down.");
                    System.exit(1);
                }
                System.out.println("Client name is \"" + name + "\".");
                System.out.println("Sending feedback");
                out.println("Welcome " + name + "!");

                in.close();
                out.close();
                socket.close();
                System.out.println("Disconnected " + name);
            }
        }catch(Exception e){
            System.out.println("Server Error, Could not connect.");
        }
    }
}
