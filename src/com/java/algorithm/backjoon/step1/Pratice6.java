package com.java.algorithm.backjoon.step1;

import java.util.Scanner;

public class Pratice6 {
    //세자리수 X 세자리수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        String secondNum = sc.next();

        System.out.println(firstNum * (secondNum.charAt(2) - '0')); //(secondNum.charAt(2) - '0') String을 정수로 변환
        System.out.println(firstNum * (secondNum.charAt(1) - '0'));
        System.out.println(firstNum * (secondNum.charAt(0) - '0'));
        System.out.println(firstNum * Integer.parseInt(secondNum));

    }
}
