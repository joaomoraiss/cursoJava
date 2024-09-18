package secao11;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class a112 {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.now();
        Instant d2 = Instant.now();
        System.out.println(d1);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());
        System.out.println(d1.format(fmt2));
        System.out.println(d1.format(fmt1));
        System.out.println(fmt3.format(d2));

    }
}
