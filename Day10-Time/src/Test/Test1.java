package Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;

public class Test1 {
          public static void main(String[] args) {
                    LocalDateTime start = LocalDateTime.of(2022,12,27,9,30);
                    LocalDateTime end = LocalDateTime.of(2023,10,4,14,30);
//                    LocalDate end = LocalDate.of(2023, 10, 4);
                    Duration duration = Duration.between(start, end);
                    long days = duration.toDays();
                    long hours = duration.toHours();
                    System.out.println(hours);
                    System.out.println(days);
//                    Period period = Period.between( start,end);
//                    System.out.println(period.getMonths());
//                    System.out.println(period.getDays());

          }
}
