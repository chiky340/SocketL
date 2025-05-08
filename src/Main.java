import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234); // Listen on port 1234
        System.out.println("Server is waiting...");

        Socket client = server.accept(); // Accept connection
        System.out.println("Client connected!");

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String message = in.readLine(); // Read message from client
        if (){
        }else {
            System.out.println(message);
        }
    }
}