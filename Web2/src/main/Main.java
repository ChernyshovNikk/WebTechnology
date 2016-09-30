package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        boolean isInclude;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        isInclude = Handler.CheckInclude(x,y);
        System.out.println(isInclude);
    }
}
