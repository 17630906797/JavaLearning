package ATM;

public class Account {
          private String cardid;
          private String password;
          private String name;
          private char sex;
          private double money;

          public Account() {
          }

          public Account(String cardid, String password, String name, char sex, double money) {
                    this.cardid = cardid;
                    this.password = password;
                    this.name = name;
                    this.sex = sex;
                    this.money = money;
          }

          public String getCardid() {
                    return cardid;
          }

          public void setCardid(String cardid) {
                    this.cardid = cardid;
          }

          public String getPassword() {
                    return password;
          }

          public void setPassword(String password) {
                    this.password = password;
          }

          public String getName() {
                    return name;
          }

          public void setName(String name) {
                    this.name = name;
          }

          public char getSex() {
                    return sex;
          }

          public void setSex(char sex) {
                    this.sex = sex;
          }

          public double getMoney() {
                    return money;
          }

          public void setMoney(double money) {
                    this.money = money;
          }
}
