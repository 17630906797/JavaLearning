package Example;

import java.util.ArrayList;

public class Classmanger {
          private ArrayList<Student> students = new ArrayList<>();
          private  StudentOperator studentOperator = new StudentOperatorImp2();
          public Classmanger(){
                    Student s1 = new Student("迪丽热巴",'女',99);
                    Student s2 = new Student("上官婉儿",'女',90);
                    Student s3 = new Student("赵云",'男',100);
                    Student s4 = new Student("百里守约",'男',50);
                    Student s5 = new Student("瑶妹",'女',65);
                    students.add(s1);
                    students.add(s2);
                    students.add(s3);
                    students.add(s4);
                    students.add(s5);
          }
          // 1,打印全班学生的信息
          public void printInfo(){
          studentOperator.printAllInfo(students);
          }
          //2. 打印去哪不能学生的平均成绩
          public  void printScore(){
          studentOperator.printAverageScore(students);
          }
}
