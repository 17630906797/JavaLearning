package Test1;

public class test {
          public static void main(String[] args) {
                    A a1 = A.X;
                    System.out.println(a1);

                    // 枚举的构造器是私有的，不能对外创建对象
                    // A a = new A()

                    // 枚举类的第一行必须罗列的是枚举对象的名字
                    A a2 = A.Y;
                     // 枚举类提供了一些额外的API

                    A[] as = A.values();  // 拿到全部的枚举对象
                    for (int i = 0; i < as.length; i++) {
                              System.out.println(as[i]);
                    }

                    }
          }


