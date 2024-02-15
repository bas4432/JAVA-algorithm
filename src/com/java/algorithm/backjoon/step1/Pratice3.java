package com.java.algorithm.backjoon.step1;

import java.util.Scanner;

public class Pratice3{
    //시간 복잡도??
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 0의시간 소요
        long start = System.currentTimeMillis();
        System.out.println(str + "??!"); //1시간 소요
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");
    }
}
