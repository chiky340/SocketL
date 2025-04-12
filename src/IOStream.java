import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class IOStream {
    public static void main(String[] args){
        try (FileWriter fw = new FileWriter("file.txt")) {
            System.out.println("file has been made");
        }catch (FileNotFoundException e){
            System.out.println("file was not found");
        } catch (IOException e){
            System.out.println("couldnt make file");
        }
    }
}
