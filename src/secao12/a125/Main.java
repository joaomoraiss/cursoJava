package secao12.a125;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to New Zealand",
                "I'm going to visit this wonderful country!", 12);
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See yoy tomorrow", 5);

        Comment p11 = new Comment("Have a nice trip");
        Comment p12 = new Comment("Wow that's awesome");
        Comment p21 = new Comment("Good night");
        Comment p22 = new Comment("May the force be with you");

        p1.addComment(p11);
        p1.addComment(p12);

        p2.addComment(p21);
        p2.addComment(p22);

        System.out.println(p1.toString());

    }
}
