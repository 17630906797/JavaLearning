package Example;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator {
          @Override
          public void printAllInfo(ArrayList<Student> students) {
                    System.out.println("----------------------全部学生信息如下---------------------");
                    for (int i = 0; i < students.size(); i++) {
                              System.out.println("姓名："+students.get(i).getName()+"，性别："+students.get(i).getSex()+"，成绩："+students.get(i).getScore());
                    }
                    System.out.println("-------------------------------------------------------------");
          }

          @Override
          public void printAverageScore(ArrayList<Student> students) {
                    double num=0 ;
                    for (int i = 0; i < students.size(); i++) {
                              num+=students.get(i).getScore();
                    }
                    System.out.println("全部学生的平均成绩是：" + num / students.size());
          }
}
