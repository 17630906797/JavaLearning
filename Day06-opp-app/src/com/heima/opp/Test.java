package com.heima.opp;

public class Test {
          public static void main(String[] args) {
                    //实体类和操作类
                    Student s1 = new Student(98,"波妞");
                    System.out.println(s1.getName());
                    System.out.println(s1.getScore());
                    //  创建一个的对实体类进行操作的操作类，并且掌握使用方法和使用场景
                    StudentOperator op1 = new StudentOperator(s1);
                    op1.printpass();
          }
}
