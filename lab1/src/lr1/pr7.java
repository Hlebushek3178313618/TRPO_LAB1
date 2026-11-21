package lr1;

import java.time.Year;
import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
                    
        Scanner in = new Scanner(System.in);

        int year = Year.now().getValue();

        System.out.println("Введите Ваш возраст: ");
        int age = in.nextInt();

        int birthYear = year - age;
        System.out.printf("Вы родились в %d году\n", birthYear);
        in.close();
    }
}
