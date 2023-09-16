package com.heima.Random;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        //猜数字游戏，生成一个0-999的随机数，根据用户的猜测结果提示是大还是小
        Random r = new Random();
        int num = r.nextInt(1000);
        System.out.println("请输入您猜测的数字：");
        while(true){
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            if (data>num){
                System.out.println("您猜大了");
            }
            else if(data<num){
                System.out.println("您猜小了");
            }
            else{
                System.out.println("恭喜您猜对了！,正确结果是：" + data);
                break;
            }

        }



    }
}
