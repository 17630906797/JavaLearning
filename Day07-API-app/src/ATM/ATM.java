package ATM;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ATM {

          // 打印菜单信息
          public void start() {
                    System.out.println("==================ATM 系统==================");
                    System.out.println("||                                                                                                          ||");
                    System.out.println("||                                 请输入您要进行的操作                                   ||");
                    System.out.println("||                                                                                                          ||");
                    System.out.println("||                          1.注册银行账户           2.登录银行账户                  ||");
                    System.out.println("||                          3.查询账户余额           4.取款                                 ||");
                    System.out.println("||                          5. 转账                         5.注销账户                          ||");
                    System.out.println("||                          6. 退出系统                                                             ||");
                    System.out.println("||                                                                                                          ||");
                    System.out.println("==========================================");
          }

          private String filename;

          public ATM(String filename) {
                    this.filename = filename;
          }

          // 创建一个用于存储银行账户信息的本地文档
          public void CreatAcountFile() {
                    try {
                              File file = new File(filename);
                              if (file.createNewFile()) {
                                        System.out.println("本地文档创建成功！");
                              } else {
                                        System.out.println("本地文档已存在！");
                              }
                    } catch (IOException file) {
                              System.out.println("创建本地文档时出错: " + file.getMessage());
                    }
          }
          // 随机生成12位银行卡号
          public String RandomCreateCardID(){
                    Random r = new Random();
                    StringBuilder cardID = new StringBuilder();
                    for (int i = 0; i < 12; i++) {
                              int num = r.nextInt(10);
                              cardID.append(num);
                    }
                    System.out.println("您的卡号是：" + cardID);
                    return cardID.toString();
          }
          // 1. 完善注册银行账户并添加到本地文档的操作
          public void signup() {
                    try {
                              System.out.println("请输入开户人的姓名：");
                              Scanner sc = new Scanner(System.in);
                              String name = sc.next();
                              System.out.println("请输入开户人的性别：");
                              char sex = sc.next().charAt(0);
                              while (true) {
                                        System.out.println("请设置账户密码：");
                                        String password = sc.next();
                                        System.out.println("请再次设置账户密码：");
                                        String password2 = sc.next();
                                        if (password.equals(password2)) {
                                                  System.out.println("创建账户成功！");
                                                  // 随机生成一个卡号
                                                  String cardID = RandomCreateCardID();

                                                  // 将账户信息以文本形式追加到本地文档
                                                  Account account = new Account(cardID, password, name, sex, 0);

                                                  try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                                                            // 格式化账户信息，例如以逗号分隔
                                                            String accountInfo ="============================="+"\n"+"卡号:"+account.getCardid() + "\n"
                                                                    +"密码:"+ account.getPassword() + "\n" + "姓名:"+account.getName() + "\n" +"性别:" + account.getSex() + "\n" +"余额:"+ account.getMoney();
                                                            writer.write(accountInfo);
                                                            writer.newLine(); // 换行
                                                            System.out.println("账户信息已写入本地文档");
                                                  } catch (IOException e) {
                                                            System.out.println("写入账户信息时出错: " + e.getMessage());
                                                  }
                                                  break;
                                        } else {
                                                  System.out.println("两次输入的密码不相同，请重试");
                                        }
                              }
                    } catch (Exception e) {
                              e.printStackTrace();
                    }
          }

}
