package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
          public static void main(String[] args) {

          }

          public static void method() {
                    String regex = "1[3456789]\\d{9}|(\\d{3,4}-)?\\d{7,8}|(\\d{3,4}-)?\\d{7,8}|1[3456789]\\d{9}|\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
                    // 定义爬取规则

                    String str =
                                    "                            手机号码1：13812345678\n" +
                                    "                            手机号码2：13698765432\n" +
                                    "                            座机号码1：010-1234567\n" +
                                    "                            座机号码2：021-87654321\n" +
                                    "                            座机号码3：0755-5678901\n" +
                                    "                            热线电话1：400-800-1234\n" +
                                    "                            热线电话2：800-1234567\n" +
                                    "                            电子邮箱1：example@example.com\n" +
                                    "                            电子邮箱2：contact@domain.co.uk";

                    Pattern compile = Pattern.compile(regex);
                    Matcher matcher = compile.matcher(str);
                    while (matcher.find()) {
                              String str1 = matcher.group();
                              System.out.println(str1);
                    }
          }
}
