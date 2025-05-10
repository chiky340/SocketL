import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1235)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("someone connected");
                new Thread(() -> {
                    try (BufferedReader reader = new BufferedReader(
                            new InputStreamReader(clientSocket.getInputStream(), StandardCharsets.UTF_8))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.out.println("Error reading from client: " + e.getMessage());
                    }
                }).start();
                new Thread(()->{

                }).start();
            }
        } catch (IOException e) {
            System.out.println("Something happened with the I/O: " + e.getMessage());
        }
    }
}
