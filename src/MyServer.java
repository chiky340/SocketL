import java.io.*;
import java.net.ServerSocket;

public class MyServer {
    public static void main(String[] args){
       public void start(final int portNumber){
           try(var serverSocket = new ServerSocket(portNumber)){
               var socket = serverSocket.accept();
           }catch (IOException e){
               throw new RuntimeException(e);
           }
        }

    }
}
