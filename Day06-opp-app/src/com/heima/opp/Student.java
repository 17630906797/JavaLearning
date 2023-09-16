package com.heima.opp;

public class Student {
          // 1. 实体类的所有成员变量必须是私有的
          private int score;
          private String name;
          // 2. 实体类必须有一个无参数构造器

          // 无参数构造器
          public Student() {
          }

          // 有参数构造器
          public Student(int score, String name) {
                    this.score = score;
                    this.name = name;
          }

          // 为私有变量生成的get和set方法
          public int getScore() {
                    return score;
          }

          public void setScore(int score) {
                    this.score = score;
          }

          public String getName() {
                    return name;
          }

          public void setName(String name) {
                    this.name = name;
          }
}
