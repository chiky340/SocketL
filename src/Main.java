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
        try(var sSocket = new ServerSocket(1234)){
            while (true){
               var clientSocket = sSocket.accept();


            }
        }catch (IOException){
            System.out.println("something happened with the I/O");
        }
    }
}