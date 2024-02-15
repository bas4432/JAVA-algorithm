package com.java.algorithm.backjoon.step2;

import java.util.Scanner;

public class Pratice3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inityear = sc.nextInt();

        if((inityear%4 == 0) && (inityear%100 !=0 || inityear%400==0)){
            System.out.println("1");
        }else {
            System.out.println("0");
        }

    }
}
