package com.heima.Array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //一个评分小游戏，有六个评委，对各个选手的进行成绩评定，最后计算出选手的平均分
        double[] score = new double[6];
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("请" + (i+1) + "号评委进行打分:\n");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            score[i] = data;
            sum+=score[i];
        }
        System.out.println("这位选手的最终得分是：\n" + sum / 6);
    }
}
