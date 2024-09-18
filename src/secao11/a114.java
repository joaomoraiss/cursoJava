package secao11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class a114 {
    public static void main(String[] args) {
        Instant i1 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime ldt1 = LocalDateTime.ofInstant(i1, ZoneId.systemDefault());

        LocalDateTime pastWeek = ldt1.minusWeeks(2);

        Duration d1 = Duration.between(ldt1, pastWeek);
        System.out.println(d1.toDays());

        System.out.println(frmt1.format(ldt1));
        System.out.println(frmt1.format(pastWeek));
    }
}
