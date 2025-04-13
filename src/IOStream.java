import java.io.*;

public class IOStream {
    public static void main(String[] args){
        try (var br = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println(br.lines());
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }catch (IOException e){
            System.out.println("file wasnt read");
        }

        
    }
}
