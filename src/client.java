import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args)throws Exception {
        Socket socket = new Socket("localhost", 1234); // Connect to server

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        var scanner = new Scanner(System.in);
        while(true){
            var input = scanner.next();
            if (input.equals("close"))
                break;
            else {
                out.println(input);
            }
        }

        socket.close();
    }
}
