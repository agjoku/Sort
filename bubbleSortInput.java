import java.util.Scanner;
public class bubbleSortInput {
    public static void main(String[] args) {
        //入力した値を返すプログラム
        int array[] = new  int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("数値を入力してください");
        int num = scanner.nextInt();
        System.out.println("入力した数値は" + num + "です。");
        //10回任意の値を入力しバブルソートを行うプログラム
        bubbleSortInput.array(array);
    }

    public static void array(int[] array) {
        int numarray[] = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("配列" + (i + 1) + "を入力");
            Scanner scanner = new Scanner(System.in);
            numarray[i] = scanner.nextInt();
            System.out.println("配列" + i + "に" + numarray[i] + "を入力");
        }
        for (i = 0; i < 10; i++) {
            System.out.print("|" + (i + 1) + ":");
            System.out.print(numarray[i]);
            //System.out.print("|");
        }
        System.out.print("|");
    }
}
