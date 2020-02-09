import java.io.*;

public class Test17 {

    public static void main(String[] args) {
        String str;
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop'");

        try (FileWriter file = new FileWriter("C:\\Users\\user\\Desktop\\file.txt")) {
            int i = 1;
            do {
                System.out.print(i + " - ");
                i++;
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                file.write(str);
            } while (str.compareTo("stop") != 0);

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}