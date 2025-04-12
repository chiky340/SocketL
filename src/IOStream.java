import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class IOStream {
    public static void main(String[] args){
        try (FileWriter fw = new FileWriter("file.txt")) {
            System.out.println("file has been made");
        }catch (IOException e){
            System.out.println("""
                    couldnt write file
                    """);
        }
    }
}
