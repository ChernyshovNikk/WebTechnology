package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by NotePad.by on 30.09.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива A:");
        int N = sc.nextInt();
        double[] analyzeArray_A = new double[1000];

        System.out.println("Введите элементы массива A:");
        for(int i=0; i<N; i++)
            analyzeArray_A[i] = sc.nextDouble();

        System.out.println("Введите размерность массива B:");
        int M = sc.nextInt();
        double[] analyzeArray_B = new double[1000];

        System.out.println("Введите элементы массива B:");
        for(int i=0; i<M; i++)
            analyzeArray_B[i] = sc.nextDouble();

        Handler.ArraysAssociation(analyzeArray_A,N,analyzeArray_B,M);
    }
}
