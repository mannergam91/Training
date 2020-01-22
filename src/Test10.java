import java.util.Scanner;

public class Test10 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите z");
        int z = scan.nextInt();

        System.out.println("Введите q");
        int q = scan.nextInt();

        int i, t;
        int table[][] = {{z, q}, {z, q}};
        for (t = 0; t < 2; t++) {
            for (i = 0; i < 2; i++) {
                table[t][i] = (t * 2) + i + 1;
                System.out.print((table[t][i] * 2) + " ");

            }
            System.out.println();
        }
    }
}