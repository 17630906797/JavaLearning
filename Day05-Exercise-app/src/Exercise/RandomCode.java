package Exercise;

import java.util.Random;

public class RandomCode {
          public static void main(String[] args) {
                    //目标：生成一串验证码，验证码包含数字、大写字母、小写字母三种类型的数据
                    String randomcode = Code(4);
                    System.out.println("验证码是：" + randomcode);
          }

          public static String Code(int n) {
                    // 1.先看分别要生成几位n验证码
                    Random r = new Random();
                    StringBuilder str = new StringBuilder();
                    for (int i = 0; i < n; i++) {
                              // 2.每位验证码随机一种类型的数据，共三种类型
                              int type = r.nextInt(3);
                              // 3. 0代表生成数字类型，1代表生成小写字母，2代表生成大写字母
                              switch (type) {
                                        case 0 ->
                                                // 4.把随机生成的一位数字放到code里面去
                                                str.append(r.nextInt(10));
                                        case 1 -> {
                                                  // 5. 小写字母在编码表里是a=97
                                                  char ch1 = (char) (r.nextInt(26) + 97);
                                                  str.append(ch1);
                                        }
                                        case 2 -> {
                                                  //6. 大写字母在编码表里编码是A=65
                                                  char ch2 = (char) (r.nextInt(26) + 65);
                                                  str.append(ch2);
                                        }
                              }
                    }
                    return str.toString();
          }

}
