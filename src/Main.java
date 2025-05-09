import java.io.*;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try(var sSocket = new ServerSocket(1234)){
            while (true){
               var clientSocket = sSocket.accept();

               new Thread(()->{
                   try {
                       InputStream in = clientSocket.getInputStream();
                       var reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
                       String line;
                       while((line=reader.readLine()) != null){
                           System.out.println(line);
                       }
                   } catch (IOException e) {
                       throw new RuntimeException(e);
                   }
               }).start();


            }
        }catch (IOException e){
            System.out.println("something happened with the I/O");
        }
    }
}