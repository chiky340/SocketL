import java.net.Socket;

public class MyClient {
    public void start(final int portNumber){
        try(var socket = new Socket("localHost",portNumber)){

        }
    }
}
