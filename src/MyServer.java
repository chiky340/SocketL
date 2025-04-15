import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class MyServer {
    public void start(int portNumber) {
        try (var serverSocket = new ServerSocket(portNumber)) {
            System.out.println("waiting for clients");
            var client = serverSocket.accept();
            var clientIp = client.getInetAddress().getHostAddress();
            var clientPort = client.getPort();
            var clientInput = new BufferedReader(new InputStreamReader(client.getInputStream()));

            for(String inputLine; (inputLine = clientInput.readLine()) != null;){
                System.out.println(clientIp + ":" + clientPort + ": " + inputLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

