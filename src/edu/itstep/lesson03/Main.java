package edu.itstep.lesson03;
import java.util.Scanner;

/*
Задание 1
Пользователь вводит с клавиатуры три цифры.
Необходимо создать число, содержащее эти цифры.
Например, если с клавиатуры введено 7, 3, 8,
тогда нужно сформировать число 738.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String str = "" + a + b + c;

        int d = Integer.parseInt(str);

        System.out.println(d);
        // write your code here
    }
}
