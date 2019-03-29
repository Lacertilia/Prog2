package Network;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String ip = JOptionPane.showInputDialog(null, "IP?", "Connect to...", JOptionPane.QUESTION_MESSAGE);
        int port = Integer.parseInt(JOptionPane.showInputDialog(null, "Port", "Port...", JOptionPane.QUESTION_MESSAGE));
        Socket socket = null;

        try{
            socket = new Socket(ip, port);
        }catch(Exception e){
            System.out.println("Failed to connect, shutting down");
            System.exit(0);
        }

        try{
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println(JOptionPane.showInputDialog(null, "Name?", "Identify!"));

            String msg = in.readLine();
            JOptionPane.showMessageDialog(null, msg, "Server said", JOptionPane.INFORMATION_MESSAGE);

            in.close();
            out.close();
            socket.close();
            System.out.println("Done");
        }catch(Exception e){
            System.out.println("Failed to communicate.");
        }
    }
}
