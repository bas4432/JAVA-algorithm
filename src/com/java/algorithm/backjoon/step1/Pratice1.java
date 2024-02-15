package com.java.algorithm.backjoon.step1;

import java.util.Scanner;

public class Pratice1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();

        double result = A/B;

        System.out.printf("%.10f" ,result);
    }
}
