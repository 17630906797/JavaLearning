package Exercise;

import java.util.Random;

public class Score {
          //目标：有十名选手比赛，分别由8位评委进行打分（随机打分0-100）
          // 对每个选手进行打分，然后去除最高分和最低分，最后求出每个选手的平均分，再得出前三名
          public static void main(String[] args) {
                    int[] player1 = new int[8];
                    player1 = Player(player1);
                    System.out.println("各评委的打分是：");

                    for (int i = 0; i < 8; i++) {
                              System.out.print(player1[i] + "  ");
                    }
                    System.out.println(" ");
                    int i = player1[Max(player1)];
                    int j = player1[Min(player1)];
                    double k = (Sum(player1) - i - j) / 6;
                    System.out.println("这位选手的成绩是：" + k);

          }

          public static int[] Player(int[] arr) {
                    Random r = new Random();
                    //随机生成选手的成绩数据
                    for (int i = 0; i < arr.length; i++) {
                              arr[i] = r.nextInt(101);
                    }
                    return arr;
          }

          public static int Max(int[] arr) {
                    //找每个数组的最大值的索引值
                    int temp = arr[0];
                    int index = 0;
                    for (int i = 0; i < arr.length; i++) {
                              if (arr[i] > temp) {
                                        temp = arr[i];
                                        index = i;
                              }
                    }
                    System.out.println("这位选手的最高分是" + arr[index] + ",予以去除");
                    return index;
          }

          public static int Min(int[] arr) {
                    //找每个数组的最小值的索引值
                    int temp = arr[0];
                    int index = 0;
                    for (int i = 0; i < arr.length; i++) {
                              if (arr[i] < temp) {
                                        temp = arr[i];
                                        index = i;
                              }
                    }
                    System.out.println("这位选手的最低分是" + arr[index] + ",予以去除");
                    return index;
          }

          public static int Sum(int[] arr) {
                    // 对每个选手的成绩进行求和
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                              sum += arr[i];
                    }
                    return sum;
          }
}
