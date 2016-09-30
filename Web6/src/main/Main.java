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
        System.out.println("Введите размерность массива:");
        int N = sc.nextInt();
        double[] analyzeArray = new double[1000];
        System.out.println("Введите элементы массива:");
        for(int i=0; i<N; i++)
            analyzeArray[i] = sc.nextDouble();
        Handler.GetSquareMatrix(analyzeArray,N);
    }
}
