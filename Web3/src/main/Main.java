package main;

import handler.Handler;
import java.util.Scanner;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a:");
        double a = sc.nextInt();
        System.out.println("Введите значение b:");
        double b = sc.nextInt();
        System.out.println("Введите значение h:");
        double h = sc.nextInt();
        Handler.GetFunctionValues(a,b,h);
    }
}
