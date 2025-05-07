import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class client {
    public static void main(String[] args)throws Exception{
        var socket = new Socket("localhost",1234);

        var in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    }
}
