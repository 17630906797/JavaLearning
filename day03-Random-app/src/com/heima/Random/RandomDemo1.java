package com.heima.Random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //目标：生成十个随机数
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int j = r.nextInt(10);
            System.out.println("这次生成的随机数是：" + j);
        }
    }
}
