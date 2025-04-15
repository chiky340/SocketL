import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public void start(final int portNumber, final Scanner scanner){
        try(var socket = new Socket("localHost",portNumber)){
            System.out.println("socket created");
            for(String userInput; !(userInput = scanner.nextLine()).isEmpty())
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
