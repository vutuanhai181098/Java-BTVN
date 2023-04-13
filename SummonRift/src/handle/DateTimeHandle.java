package handle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeHandle {
    public String convertDateTime(String strings){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(strings, dateTimeFormatter);
        String dateTime = localDateTime.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm"));
        return dateTime;
    }
}
