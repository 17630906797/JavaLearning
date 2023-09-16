package com.heima.Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总金额是：" + sum);
        //动态创建数组
        String[] names = new String[30];
    }
}
