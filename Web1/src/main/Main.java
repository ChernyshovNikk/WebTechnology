package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Main {
    public static void main(String[] args){
        double expression;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        expression = Handler.SolveExpresiion(x,y);
        System.out.println(expression);
    }
}
