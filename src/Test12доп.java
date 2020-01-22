import java.util.Scanner;
public class Test12доп {


        public static void main(String args[]) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите предложение:");
            String str = scan.nextLine();

            char[] chArray = str.toCharArray();

            int n = chArray.length;//кол. символов в массиве
            int len = 0; // разница

            for (int i = 0; i < n; i++) {
                if (chArray[i] == ' ') {
                    len++;
                }
            }
            char[] arr = new char[n-len];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (!(chArray[i] == ' ')) {
                    arr[j] = chArray[i];
                    j++;
                }
            }

            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]);
            }

        }
    }

