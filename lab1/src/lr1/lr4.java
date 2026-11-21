package lr1;

import java.util.Scanner;

public class lr4 {

        public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String month = in.nextLine();
        System.out.println("Введите число дней: ");
        int num = in.nextInt();

        in.close();

        System.out.printf("В месяце %s: %d дней\n", month, num);

}
}
