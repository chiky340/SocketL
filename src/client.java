import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class client {
    public static void main(String[] args)throws Exception {
        try(var socket = new Socket("localhost",1235)){
            var outS = socket.getOutputStream();
            var fileW = new PrintWriter(new OutputStreamWriter(outS , StandardCharsets.UTF_8));
            var fileIn = new BufferedReader(new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8))

            var scan = new Scanner(System.in);
            while(true) {
                var input = scan.nextLine();
                new Thread(() -> {
                    if (input.equalsIgnoreCase("close")) {
                        System.out.println("closing");
                    } else {
                        fileW.println(input);
                        fileW.flush();
                    }
                }).start();
                new Thread(()->{

                }).start();
            }

        }
    }
}
