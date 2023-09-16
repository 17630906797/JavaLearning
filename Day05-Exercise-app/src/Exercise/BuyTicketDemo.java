package Exercise;

public class BuyTicketDemo {
    public static void main(String[] args) {
        //目标：是做一个机票优惠函数
        double prince=discount(10,"头等舱",500);
        System.out.println("优惠价格是：" + prince);
    }

    public static double discount(int month, String type, double price) {
        if (month >= 5 && month <= 10) {
            //旺季
            switch (type) {
                case "头等舱" -> price *= 0.9;
                case "经济舱" -> price *= 0.85;
            }
        } else {
            //淡季
            switch (type) {
                case "头等舱" -> price *= 0.7;
                case "经济舱" -> price *= 0.65;
            }
        }
        return price;
    }
}
