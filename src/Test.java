import java.io.*;

public class Test {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("C:\\Users\\user\\Desktop\\file.txt"))
        {

            String text = "Hello Gold!";
            writer.write(text);

            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}