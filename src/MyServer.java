import java.io.IOException;
import java.net.ServerSocket;

public class MyServer {
    public void start(int portNumber) {
        try (var serverSocket = new ServerSocket(portNumber)) {
            var socket = serverSocket.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

