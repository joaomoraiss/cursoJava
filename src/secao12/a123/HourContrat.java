package secao12.a123;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class HourContrat {
    private LocalDate date;
    private double valuePerHour;
    private Integer hours;

    public double totalValue(){
        return hours * valuePerHour;
    }

    public HourContrat(LocalDate date, double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String toString(){
        return "Date: "+date.getMonthValue()+"/"+date.getYear()+"\n"+
                "Valor por hora: "+valuePerHour+"\n"+
                "Horas: "+hours;
    }
}
