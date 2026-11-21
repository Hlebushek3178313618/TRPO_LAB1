package lr1;

import java.time.Year;
import java.util.Scanner;

public class lr5 {
public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            
            int year = Year.now().getValue();

            System.out.println("Введите Ваш год рождения: ");
            int birthYear = in.nextInt();
            int age = year - birthYear;
            System.out.printf("Ваш возраст: %d лет\n", age);
            in.close();
}
}
