package com.java.algorithm.backjoon.step2;

import java.util.Scanner;

public class Pratice2 {

    public static void main(String[] args) {

        int[] score1 = new int[101];

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
