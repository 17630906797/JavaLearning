package com.heima.Exercise;

public class MoviesOperator {
          // 构建一个对电影实体类进行操作的电影操作类
          Movies[] movies;

          // 一个有参数的构造器
          public MoviesOperator(Movies[] movies) {
                    this.movies = movies;
          }

          // 一个对电影类数组进行打印信息的方法
          public void PrintMoviesInfo(Movies[] movies) {
                    for (int i = 0; i < movies.length; i++) {
                              Movies m = movies[i];
                              System.out.println("ID：" + m.getId());
                              System.out.println("name：" + m.getName());
                              System.out.println("price：" + m.getPrice());
                              System.out.println("score：" + m.getScore());
                              System.out.println("director：" + m.getDirector());
                              System.out.println("actor：" + m.getActor());
                              System.out.println("info：" + m.getInfo());
                              System.out.println("------------------------------------------------");

                    }


          }

          // 一个通过ID进行电影搜索的方法
          public void SearchMoviesById(int id) {
                    for (int i = 0; i < movies.length; i++) {
                              if (movies[i].getId() == id) {
                                        System.out.println("找到了，该电影的详细信息如下：");
                                        System.out.println("ID：" + movies[i].getId());
                                        System.out.println("name：" + movies[i].getName());
                                        System.out.println("price：" + movies[i].getPrice());
                                        System.out.println("score：" + movies[i].getScore());
                                        System.out.println("director：" + movies[i].getDirector());
                                        System.out.println("actor：" + movies[i].getActor());
                                        System.out.println("info：" + movies[i].getInfo());
                                        return;
                              }
                    }
                    System.out.println("找不到该电影");
          }
}
