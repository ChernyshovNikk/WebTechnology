package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by NotePad.by on 29.09.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Введите размерность массива:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] analyzeArray = new int[N];
        System.out.println("Введите элементы массива:");

        for(int i=0; i<N; i++)
            analyzeArray[i]= sc.nextInt();

        Handler.MakeIncreasingArray(analyzeArray,N);
    }
}
