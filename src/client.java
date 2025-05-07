import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client {
    public static void main(String[] args)throws Exception{
        var socket = new Socket("localhost",1234);

        var in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        var out = new PrintWriter(socket.getOutputStream());

        out.println("hello from server");

        var response = in.readLine();
        System.out.println("server says: "+ response);
    }
}
