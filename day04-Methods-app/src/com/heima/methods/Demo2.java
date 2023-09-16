package com.heima.methods;

public class Demo2 {
    public static void main(String[] args) {
        //判断两个数组是否相同
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 20, 30, 40, 50};
        int[] arr3 = {20, 20, 30, 40, 50};
        int[] arr4 = {};
        int[] arr5 = null;
        System.out.println("-------------Test1-------------");
        JudgeSame(arr1, arr2);
        System.out.println("-------------Test2-------------");
        JudgeSame(arr1, arr3);
        System.out.println("-------------Test3-------------");
        JudgeSame(arr1, arr4);
        System.out.println("-------------Test4-------------");
        JudgeSame(arr1,arr5);
    }

    public static boolean JudgeSame(int[] arr1, int[] arr2) {
        //保证健壮性
        if (arr1 == null || arr2 == null) {
            System.out.println("有空地址数组");
            return false;
        }
        //只有等长的数组才有可比性
        else if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) { //出现不相等的情况
                    System.out.println("两个数组不相等");
                    return false;
                }
            }
            System.out.println("两个数组相同");
            return true;
        }
        //两个数组不相等直接false
        else
            System.out.println("两个数组不是等长的");
            return false;
    }
}
