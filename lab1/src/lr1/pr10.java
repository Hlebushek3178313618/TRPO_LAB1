package lr1;

import java.util.Scanner;

public class pr10 {

public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

        System.out.println("Введите A: ");
        int a = in.nextInt();
        System.out.println("Введите B: ");
        int b = in.nextInt();
        in.close();

        System.out.printf("Сумма = %d \nРазность = %d", (a + b), (a - b));

    }
}
