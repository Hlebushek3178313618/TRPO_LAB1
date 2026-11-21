package lr1;

import java.util.Scanner;

public class pr8 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

        System.out.println("Введите A: ");
        int a = in.nextInt();
        System.out.println("Введите B: ");
        int b = in.nextInt();

        System.out.printf("Сумма = %d", (a + b));
        in.close();

    }
    }
