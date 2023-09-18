package ATM;

import java.util.Scanner;

public class Test {
          public static void main(String[] args) {
                    ATM atm = new ATM("D:\\acount\\acounters.txt ");
                    atm.CreatAcountFile();
                    atm.start();
                    Scanner sc = new Scanner(System.in);
                    int num = sc.nextInt();
                    switch (num){
                              case 1 -> atm.signup();
//                              case 2 -> atm.login();
//                              case 3 -> atm.money();
                    }

          }
}
