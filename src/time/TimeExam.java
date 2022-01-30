package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        LocalDate ld = LocalDate.of(2022, Month.DECEMBER, 30);
        System.out.println(ld);

        LocalTime lt1 = LocalTime.of(17, 18);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.parse("10:15:30");
        System.out.println(lt2);

        // 현재 날짜와 시간 정보를 getter 메서드로 구할 수 있음
        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);
        Month month = timePoint.getMonth();
        System.out.println(timePoint.getMonthValue());
        System.out.println(month.getValue());
        System.out.println(timePoint.getHour());
        System.out.println(timePoint.getMonth());
    }
}


