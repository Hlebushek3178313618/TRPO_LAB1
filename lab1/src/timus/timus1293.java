package timus;

import java.util.Scanner;

public class timus1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.next()); // читаем до пробела + конвертируем в int
        int a = Integer.parseInt(in.next());
        int b = Integer.parseInt(in.next());
        in.close();

        int sum = 2 * n * (a * b); // n панелеей * площадь одной с 2 сторон
        System.out.println(sum);

    }

}
