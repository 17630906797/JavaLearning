package com.heima.api;


import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
          // 对商品实体类进行操作的类

          // 定义一个ArrayList的集合，用于存储Food类的信息
          private ArrayList<Food> foodlist = new ArrayList<>();

          //开发第一个功能：商家菜品信息
          public void addfood() {
                    Food f = new Food();
                    System.out.println("请输入要上架的菜品名称：");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.next();
                    f.setName(name);
                    System.out.println("请输入要上架的菜品价格：");
                    Double price = sc.nextDouble();
                    f.setPrice(price);
                    System.out.println("请输入要上架的菜品描述信息：");
                    String info = sc.next();
                    f.setInfo(info);
                    foodlist.add(f);
                    System.out.println("添加菜品成功！");
          }

          // 开发第二个功能，来展示所有商品信息
          public void display() {
                    for (int i = 0; i < foodlist.size(); i++) {
                              Food f = foodlist.get(i);
                              System.out.println(f.getName());
                              System.out.println(f.getPrice());
                              System.out.println(f.getInfo());
                              System.out.println("-------------------------------------------");
                    }
          }

}
