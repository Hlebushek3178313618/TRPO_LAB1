package lr1;

import java.time.Year;
import java.util.Scanner;

public class lr6 {
public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            
            int year = Year.now().getValue();

            System.out.println("Введите имя: ");
            String name = in.nextLine();
            System.out.println("Введите Ваш год рождения: ");
            int birthYear = in.nextInt();
            int age = year - birthYear;
            System.out.printf("Вас зовут: %s ,ваш возраст: %d лет\n", name, age);
            in.close();
}
}