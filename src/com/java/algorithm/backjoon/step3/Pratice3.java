package com.java.algorithm.backjoon.step3;

import java.util.Scanner;

public class Pratice3 {

    public static void main(String[] args){
        //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        //첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n ;i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
