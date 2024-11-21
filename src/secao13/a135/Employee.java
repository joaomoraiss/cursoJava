package secao13.a135;

public class Employee implements EmployeeAtb {
    String name;
    int hours;
    Double valuePerHour;

    public Employee(String name, int hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    @Override
    public Double payment() {
        return valuePerHour * hours;
    }
}
