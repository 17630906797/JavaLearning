package com.heima.variable;
//import java.util.Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //1.导包，一般不用自己导，idea会自动导入
        //2.创建一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);
        //3.提醒用户打印
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("您是成年人了。");
        }
        else {
            System.out.println("您还不是成年人");
        }
//        for()
//        System.out.println("您的年龄是"+age);
    }
}
