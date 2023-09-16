package Exercise;

import java.util.Random;
import java.util.Scanner;

public class DoubleColor {
          public static void main(String[] args) {
                    // 做出一个双色球彩票程序,蓝色相同就中奖
                    int[] numbers = new int[7];
                    int[] luckeynumbers = new int[7];
                    numbers = CreateNumber();
                    System.out.println("您选择的7位数字是：");
                    PrintArray(numbers);
                    System.out.println("中奖的7位数字是：");
                    luckeynumbers=LuckeyNumber();
                    PrintArray(luckeynumbers);
                    WinType(numbers,luckeynumbers);
          }
          public static void WinType(int[] numbers,int[] luckeynumbers){
                    //记录红、蓝球号码相同的个数
                    int redcount =0;
                    int bluecount =0;
                    for (int i = 0; i < 6; i++) {
                              for (int j = 0; j < 6; j++) {
                                        if(numbers[i] == luckeynumbers[j]){
                                                  redcount++;
                                        }
                              }
                    }
                    if(numbers[6]==luckeynumbers[6]){
                              bluecount=1;
                    }
                    if(bluecount==1){
                              switch (redcount) {
                                        case 0 -> System.out.println("恭喜您的中6等奖，金额为：100元");
                                        case 1 -> System.out.println("恭喜您的中5等奖，金额为：200元");
                                        case 2 -> System.out.println("恭喜您的中4等奖，金额为：300元");
                                        case 3 -> System.out.println("恭喜您的中3等奖，金额为：400元");
                                        case 4 -> System.out.println("恭喜您的中2等奖，金额为：500元");
                                        case 5 -> System.out.println("恭喜您的中1等奖，金额为：600元");
                                        case 6 -> System.out.println("恭喜您的中特等奖，金额为：1000元");
                              }
                    }else {
                              System.out.println("很遗憾您未中奖！");
                    }
          }
          // 随机生成一组中奖号码
          public static int[] LuckeyNumber(){
                    int[] luckeynumber=new int[7];
                    Random r = new Random();
                    for (int i = 0; i < luckeynumber.length; i++) {
                              if(i<6){
                                        //生成红球，范围1-33
                                        while (true) {
                                                  int number = r.nextInt(33)+1;
                                                  if(IsRepeat(luckeynumber,number,i) ){
                                                            luckeynumber[i]=number;
                                                            break;
                                                  }
                                        }

                              }else {
                                        // 输入蓝球号码
                                        luckeynumber[6]=r.nextInt(18)+1;
                              }
                    }
                    return luckeynumber;
          }
          // 打印数组
          private static void PrintArray(int[] numbers) {
                    System.out.print("[");
                    for (int i = 0; i < numbers.length; i++) {
                              if (i < 6) {
                                        System.out.print(numbers[i] + ",");
                              } else {
                                        System.out.print(numbers[i] + "]"+"\n");
                              }
                    }
          }

          // 1.首先先做出让顾客选出6个红球号码（1-33）之间，且不能重复选号，最后再选一个蓝球号码（1-18）
          public static int[] CreateNumber() {
                    int[] numbers = new int[7];
                    // 创建用于存储用户选号的数组

                    //输入红球号码
                    for (int i = 0; i < 7; i++) {
                              // 判断用户选择的号码是不是符合要求，首先得在范围内，再者不能重复
                              while (true) {
                                        Scanner r = new Scanner(System.in);
                                        System.out.println("请输入你当前选择的第" + (i + 1) + "个号码：");
                                        int rednumber = r.nextInt();
                                        if (IsCorrect(numbers, rednumber, i)) {
                                                  numbers[i] = rednumber;
                                                  //成功输入，结束此次循环
                                                  break;
                                        }
                              }
                    }
                    return numbers;
          }

          //判断当前输入的数字是否合规
          public static boolean IsCorrect(int[] numbers, int number, int i) {
                    if (i < 6) {
                              // 判断红球是否合规
                              if ((number <= 33 && number >= 1) && IsRepeat(numbers, number, i)) {
                                        return true;
                              } else {
                                        System.out.println("当前号码超出范围，请重新选择");
                                        return false;
                              }
                    } else {
                              //判断蓝球
                              return number <= 18 && number >= 1;
                    }
          }

          // 判断当前输入的数字是否重复
          private static boolean IsRepeat(int[] numbers, int number, int i) {
                    for (int j = 0; j < i; j++) {
                              if (number == numbers[j]) {
                                        // 输入的有重复号码
                                        System.out.println("输入的有重复号码,请重新输入");
                                        return false;
                              }
                    }
                    // 当前输入与已选号码无重复
                    return true;
          }
}
