import java.io.IOException;
import java.net.Socket;

public class MyClient {
    public void start(final int portNumber){
        try(var socket = new Socket("localHost",portNumber)){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
