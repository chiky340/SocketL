import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public void start(final int portNumber, final Scanner scanner){
        try(var socket = new Socket("localHost",portNumber);
            var writer = new PrintWriter(socket.getOutputStream(),true)){
            System.out.println("socket created");
            for(String userInput; !(userInput = scanner.nextLine()).isEmpty();){
                writer.println(userInput);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
