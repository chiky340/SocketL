import java.io.*;

public class IOStream {
    public static void main(String[] args){
        try (BufferedWriter fw = new BufferedWriter(new FileWriter("file.txt"))) {
            for (int i=0;i<1000;i++) {
                fw.write( i);
                fw.newLine();
            }
            System.out.println("file has been made");
        }catch (FileNotFoundException e){
            System.out.println("file was not found");
        } catch (IOException e){
            System.out.println("couldnt make file");
        }
    }
}
