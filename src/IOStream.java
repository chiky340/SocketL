import java.io.*;

public class IOStream {
    public static void main(String[] args){
        try (FileWriter fw = new FileWriter("file.txt")) {
            var gs = new BufferedWriter(fw);
            gs.write("now using a buffered reader");
            System.out.println("file has been made");
        }catch (FileNotFoundException e){
            System.out.println("file was not found");
        } catch (IOException e){
            System.out.println("couldnt make file");
        }
    }
}
