
import java.io.*;

public class Test18 {
    public static void main(String[] args) {
        String str;

        try {
            File br = new File("C:\\Users\\user\\Desktop\\file.txt");
            FileReader file = new FileReader(br);
            BufferedReader buf = new BufferedReader(file);

            String line;
            while ((line = buf.readLine()) != null)
                System.out.println(line);

            BufferedReader bufr =
                    new BufferedReader(new InputStreamReader(System.in));
            try {

                File myFile = new File("C:\\Users\\user\\Desktop\\file.txt");
                FileReader fileReader = new FileReader(myFile);
                LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

                int lineNumber = 0;

                while (lineNumberReader.readLine() != null) {
                    lineNumber++;
                }

                System.out.println("Введите " + lineNumber + " строки и текст автоматически запишется в файл");

                try {
                    FileWriter fiw = new FileWriter("C:\\Users\\user\\Desktop\\file.txt");

                    int i = 1;
                    do {
                        System.out.print(i + " - ");
                        str = bufr.readLine();
                        fiw.write(str);
                        i++;
                    } while (i <= lineNumber);

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}