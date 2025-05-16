import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1235)) {
            var scanner = new Scanner(System.in);
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

                var input = scanner.next();
                new Thread(()->{
                    try {
                        var wr = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream(),StandardCharsets.UTF_8));
                        wr.println(input);
                        wr.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }).start();
            }
        } catch (IOException e) {
            System.out.println("Something happened with the I/O: " + e.getMessage());
        }
    }
}
