package lr1;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Введите рост: ");
        double height = in.nextFloat();
        
        in.close();

        System.out.printf("Имя: %s, возраст: %d, рост: %.2f \n", name, age, height);

}
}