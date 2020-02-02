
import java.io.*;
public class Test16 {
    public static void main(String[] args) {
        String s;
        try {
            File br = new File("C:\\Users\\user\\Desktop\\file.txt");
            FileReader file = new FileReader(br);
            BufferedReader buf = new BufferedReader(file);

            while ((s = buf.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}