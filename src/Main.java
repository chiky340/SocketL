import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Proxy;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int portNumber = 12345;

        try(var scanner = new Scanner(System.in)){
            System.out.println("is this a sever yes or no");
            if (scanner.nextLine().equalsIgnoreCase("y")){
                new MyServer().start(portNumber);
            }else{
                new MyClient().start(portNumber);
            }
        }
    }
}