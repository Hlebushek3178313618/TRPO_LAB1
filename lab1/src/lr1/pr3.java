package lr1;

import java.util.Scanner;

public class pr3 {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String name = in.nextLine();
        System.out.println("Введите месяц: ");
        String month = in.nextLine();
        System.out.println("Введите число: ");
        int num = in.nextInt();

        in.close();

        System.out.printf("Имя: %s, месяц: %s, число: %d\n", name, month, num);


    }
}
