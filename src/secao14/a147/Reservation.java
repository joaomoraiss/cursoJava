package secao14.a147;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int Duration(){
        int duration = checkOut.getDay() - checkIn.getDay();
        return duration;
    }
    public void updateDates(Date checkIn, Date checkOut){
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) throw new IllegalArgumentException("" +
                "Reservation dates for update must be future dates");
        if (!checkOut.after(checkIn)) throw  new IllegalArgumentException("Checkout date" +
                "must be after check-in date");
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String toString(){
        return "Room "+this.roomNumber+
                ", CheckIn"+sdf.format(checkIn)+
                ", CheckOut"+sdf.format(checkOut)+
                ", "+Duration()+" nights";
    }
}
