import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class client {
    public static void main(String[] args)throws Exception {
        try(var socket = new Socket("localhost",1235)){
            var outS = socket.getOutputStream();
            var fileW = new PrintWriter(new OutputStreamWriter(outS , StandardCharsets.UTF_8));

            var scan = new Scanner(System.in);
            while(true) {
                new Thread(()->{
                    BufferedWriter read = null;
                    try {
                        read = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        read.write("hello");
                        read.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }).start();
            }
        }
    }
}
