package com.heima.api;

public class Food {
          // 私有化实体类属性
          private String name;
          private Double price;
          private String Info;

          // 无参数构造器
          public Food() {
          }

          // 有参数构造器
          public Food(String name, Double price, String info) {
                    this.name = name;
                    this.price = price;
                    Info = info;
          }

          public String getName() {
                    return name;
          }

          public void setName(String name) {
                    this.name = name;
          }

          public Double getPrice() {
                    return price;
          }

          public void setPrice(Double price) {
                    this.price = price;
          }

          public String getInfo() {
                    return Info;
          }

          public void setInfo(String info) {
                    Info = info;
          }
}
