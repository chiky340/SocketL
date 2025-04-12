import java.io.*;

public class IOStream {
    public static void main(String[] args){
        try (var br = new BufferedReader(new FileReader("file.txt"))) {
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }catch (IOException e){
            System.out.println("file wasnt read");
        }
    }
}
