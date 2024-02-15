package com.java.algorithm.backjoon.step2;

import java.util.Scanner;

public class Pratice6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //A(시)와 B(분)을 하나의 분으로 변환한 뒤, C를 더하고 나온 결과 값을 다시 시와 분 으로 변환하는 방법
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int min = 60 * A + B; //A(시)와 B(분)을 하나의 분으로 변환
        min = min + C; // 요리하는데 걸린 시간 더하기

        int hour = (min / 60) % 24;  //(24시 이상이 될 경우 0시부터 시작하도록 한다)
        int minute = min % 60;

        System.out.println(hour + " " + minute);

    }
}
