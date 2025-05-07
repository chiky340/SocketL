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
        var server = new ServerSocket(1234);
        System.out.println("server is waiting");

        Socket client = server.accept();
        System.out.println("client connected");

        var in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        var out = new PrintWriter(client.getOutputStream(),true);

        var message = in.readLine();
        System.out.println("Client says: "+message);

        out.println("hello from server");
        client.close();
        server.close();

    }
}