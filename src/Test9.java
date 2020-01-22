import java.util.Scanner;

public class Test9 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите z");
        int z = scan.nextInt();
        System.out.println("Введите y");
        int y = scan.nextInt();
        System.out.println("Введите x");
        int x = scan.nextInt();

        int sample[] = {x, y, z};
        int i;
        for (i = 0; i < 3; i++) {
            sample[i] = i*2;
            System.out.println("Элемент [" + i + "]:" + sample[i]);

        }

    }

}