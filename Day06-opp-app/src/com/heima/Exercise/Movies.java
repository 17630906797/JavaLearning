package com.heima.Exercise;

public class Movies {
          // 创建一个电影的实体类,用来保存电影的数据信息
          private int id;
          private String name;
          private double price;
          private double score;
          private String director;
          private String actor;
          private String info;
          // 无参数构造器
          public Movies() {
          }
          // 有参数构造器
          public Movies(int id, String name, double price, double score, String director, String actor, String info) {
                    this.id = id;
                    this.name = name;
                    this.price = price;
                    this.score = score;
                    this.director = director;
                    this.actor = actor;
                    this.info = info;
          }

          public int getId() {
                    return id;
          }

          public void setId(int id) {
                    this.id = id;
          }

          public String getName() {
                    return name;
          }

          public void setName(String name) {
                    this.name = name;
          }

          public double getPrice() {
                    return price;
          }

          public void setPrice(double price) {
                    this.price = price;
          }

          public double getScore() {
                    return score;
          }

          public void setScore(double score) {
                    this.score = score;
          }

          public String getDirector() {
                    return director;
          }

          public void setDirector(String director) {
                    this.director = director;
          }

          public String getActor() {
                    return actor;
          }

          public void setActor(String actor) {
                    this.actor = actor;
          }

          public String getInfo() {
                    return info;
          }

          public void setInfo(String info) {
                    this.info = info;
          }
}
