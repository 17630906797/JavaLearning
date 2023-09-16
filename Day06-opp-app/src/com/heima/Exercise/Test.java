package com.heima.Exercise;

import java.util.Scanner;

public class Test {
          public static void main(String[] args) {
                    /*
                    "水门桥"，38.9，9.8，"徐克”，"吴京"，"12万人想看"
                    2,"出拳吧",39,7.8,"唐晓白",“田雨","3.5万人想看"
                    3,"月球陨落",42,7.9,"罗兰","贝瑞","17.9万人想看"
                    4,"一点就到家",35,8.7,“许宏宇”,"刘吴然”,"10.8万人想看"
                    */
                    //创建所有电影
                    // 创建一个电影类的数组来存放多个电影类
                    Movies[] movies = new Movies[4];
                    movies[0] = new Movies(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
                    movies[1] = new Movies(2, "出拳吧", 39, 7.8, "唐晓白", "田雨", "3.5万人想看");
                    movies[2] = new Movies(3, "月球陨落", 42, 7.9, "罗兰", "贝瑞", "17.9万人想看");
                    movies[3] = new Movies(4, "一点就到家", 35, 8.7, "许宏宇", "刘吴然", "10.8万人想看");
                    //创建一个电影操作类的类对象，然后通过该类对象里面的方法进行操作
                    MoviesOperator operator = new MoviesOperator(movies);
                    System.out.println("====================猫眼电影==================");
                    System.out.println("-----------------------------------菜单--------------------------------");
                    System.out.println(" ");
                    System.out.println("-------------------------1 、查询所有电影信息------------------------");
                    System.out.println("-------------------------2 、查询你想要看的电影----------------------");
                    int command;
                    Scanner sr = new Scanner(System.in);
                    boolean B = true;
                    while (B) {
                              command = sr.nextInt();
                              switch (command) {
                                        case 1 -> {
                                                  operator.PrintMoviesInfo(movies);
                                                  B = false;
                                        }
                                        case 2 -> {
                                                  System.out.println("请输入你要查询电影的编号：");
                                                  int id = sr.nextInt();
                                                  operator.SearchMoviesById(id);
                                                  B = false;
                                        }
                                        default -> System.out.println("您输入的命令有误，请重新输入！");
                              }
                    }
          }
}
