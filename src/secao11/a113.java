package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class a113 {
    public static void main(String[] args) {
        Instant i1 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime ldt1 = LocalDateTime.ofInstant(i1, ZoneId.systemDefault());

        System.out.println(ldt1.format(frmt1));

        System.out.println("Mes: "+ldt1.getMonthValue()+"\n"+
                            "Ano: "+ ldt1.getYear());
    }
}
