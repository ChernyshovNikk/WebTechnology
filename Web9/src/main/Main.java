package main;

import handler.Ball;
import handler.Basket;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by NotePad.by on 30.09.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        Basket basket = new Basket();

        Ball firstBall = new Ball("Синий",6);
        Ball secondBall = new Ball("Зеленый",3);
        Ball thirdBall = new Ball("Синий",8);
        Ball fourthBall = new Ball("Оранжевый",5);

        ArrayList<Ball> ballsList = new ArrayList<Ball>();
        ballsList.add(firstBall);
        ballsList.add(secondBall);
        ballsList.add(thirdBall);
        ballsList.add(fourthBall);

        System.out.println("Вес всех мячей в корзине: " + basket.BallsWeight(ballsList));
        System.out.println("Синих мячей в корзине: " + basket.NavyBallsColorCount(ballsList));
    }
}
