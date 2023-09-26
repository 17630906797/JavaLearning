package Example;

import java.util.ArrayList;

public class StudentOperatorImp2 implements StudentOperator {

          @Override
          public void printAllInfo(ArrayList<Student> students) {
                    int man = 0, woman = 0;
                    System.out.println("----------------------全部学生信息如下---------------------");
                    for (int i = 0; i < students.size(); i++) {
                              Student s = students.get(i);
                              if (s.getSex() == '男') {
                                        man++;
                              } else {
                                        woman++;
                              }
                              System.out.println("姓名：" + students.get(i).getName() + "，性别：" + students.get(i).getSex() + "，成绩：" + students.get(i).getScore());

                    }
                    System.out.println("男生总人数为：" + man + "，女生总人数为：" + woman);
                    System.out.println("-------------------------------------------------------------");
          }

          @Override
          public void printAverageScore(ArrayList<Student> students) {
                    double num = 0, min = students.get(0).getScore(), max = students.get(0).getScore();
                    for (int i = 0; i < students.size(); i++) {
                              if (students.get(i).getScore() > max) {
                                        max = students.get(i).getScore();
                              } else if (students.get(i).getScore() < min) {
                                        min = students.get(i).getScore();
                              }
                              num += students.get(i).getScore();
                    }
                    num = num - (max + min);
                    System.out.println("全部学生的平均成绩是：" + num / (students.size() - 2));
                    System.out.println("最高成绩是：" + max + "，最低成绩是：" + min);
          }
}
