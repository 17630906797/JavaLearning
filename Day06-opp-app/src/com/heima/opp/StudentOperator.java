package com.heima.opp;

public class StudentOperator {
          // 创建一个学生类的对象
          private Student student;
          // 创建一个有参构造器
          public StudentOperator(Student student){
                    this.student = student;
          }
          // 创建一个对学生类的操作方法
          public void printpass(){
                    if(student.getScore()>60){
                              System.out.println("考生："+student.getName()+"成绩合格");
                    }else {
                              System.out.println("考生："+student.getName()+"成绩不合格");
                    }
          }
}
