package com.java.algorithm.backjoon.step3;

import java.util.Scanner;

public class Pratice5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder str = new StringBuilder();

        for(int i=1; i<=N/4; i++){
            str.append("long ");
        }

        System.out.println(str + "int");
    }

}
