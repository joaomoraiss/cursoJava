package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class instanciandoDH {
    public static void main(String[] args) {
        DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();
        System.out.println(d1);
        LocalDate d4 = LocalDate.parse("20/02/2004", dt1);
        System.out.println(d4);
    }
}
