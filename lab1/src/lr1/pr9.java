package lr1;

import java.util.Scanner;

public class pr9 {
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = in.nextInt();
        in.close();
        
        int b = a - 1;
        int c = a + 1;
        int x = (a+b+c); // сумма трех чисел
        x = x * x; // их квадрат
        
        System.out.printf("%d %d %d %d", b,a,c,x);

}
}
