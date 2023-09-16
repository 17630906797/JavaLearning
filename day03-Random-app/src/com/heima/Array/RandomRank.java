package com.heima.Array;

import java.util.Random;

public class RandomRank {
    public static void main(String[] args) {
        //目标，对数组内的数据进行随机排序
        int[] arr = new int[10];
        Random r = new Random();
        //随机生成一个数组数据
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100);
            arr[i] = num;
            //展示生成的随机数组序列
            System.out.print(arr[i] + " ,");
        }
        //做出随机排列数组的函数
        for (int i = 0; i < arr.length; i++) {
            int temp;
            temp= arr[i];
            int num = r.nextInt(10);
            arr[i]=arr[num];
            arr[num]=temp;
        }
        System.out.println();
        System.out.println("调整后的随机生成的数组序列是：");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ,");
        }
    }
}
