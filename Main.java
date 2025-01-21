import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println("Date: " + date);

    LocalDate localDate = LocalDate.now();
    System.out.println("LocalDate: " + localDate);

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("LocalDate: " + localDateTime);

    LocalDate birthday = LocalDate.of(2008, 1, 27);
    System.out.println("Дата моего рождениЖ " + birthday);

    LocalDate adulthood = birthday.plusYears(18);
    System.out.println("Мне исполниться 18: " + adulthood);

    LocalDateTime dateTimeNY = LocalDateTime.now(ZoneId.of("America/New_York"));
    System.out.println("Дата в Нью-Йорке: " + dateTimeNY);

    String strDate = "21*01*2025";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd*MM*yyyy");
    LocalDate localDateFormStrDate = LocalDate.parse(strDate, dateTimeFormatter);
    System.out.println("Преобразование дата из строки " + localDateFormStrDate);

    LocalDateTime localDateTimeForStr = LocalDateTime.now();
    // DateTimeFormatter dateTimeFormatterForParse =
    // DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    DateTimeFormatter dateTimeFormatterForParse = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        .localizedBy(new Locale("US"));
    String strDateTime = dateTimeFormatterForParse.format(localDateTimeForStr);
    System.out.println("Строковая дата: " + strDateTime);

    LocalDateTime firstDateTime = LocalDateTime.now();
    LocalDateTime secondDateTime = firstDateTime.plusDays(2);

    if(firstDateTime.isBefore(secondDateTime)){
      System.out.println("Первая дата раньше второй!");
    }else if(firstDateTime.isAfter(secondDateTime)){
      System.out.println("Первая дата позже второй!");
    }else if(firstDateTime.isEqual(secondDateTime)){
      System.out.println("Обе даты равныё");
    }
  }
}
