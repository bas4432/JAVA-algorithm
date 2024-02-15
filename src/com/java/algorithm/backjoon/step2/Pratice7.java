package com.java.algorithm.backjoon.step2;

import java.util.Scanner;

public class Pratice7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(B == C && A == C){
            System.out.println(10000 + A * 1000);
        }else if(A==B || B==C || A==C){
            if(A==B){
                System.out.println(1000+ A * 100);
            }else if(B==C){
                System.out.println(1000+ B * 100);
            }else {
                System.out.println(1000+ C * 100);
            }
        }else if(A!=B && B!=C && A!=C){
            int max;

            if(A >= B && A>=C){
                max = A;
            }else if(B >=A && B >=C){
                max = B;
            }else {
                max = C;
            }
            System.out.println(max  * 100);
        }

    }
}
