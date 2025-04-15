import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Proxy;
import java.net.Socket;
import java.util.Scanner;

public class Main {
final int portNumber = 12345;
    public static void main(String[] args) {
        try(var scanner = new Scanner(System.in)){
            System.out.println("is this a sever yes or no");
            if (scanner.nextLine().equalsIgnoreCase("y")){
                new MyServer().start(portNumber);
            }else{
                System.out.println("Client TODO");
            }
        }
    }
}