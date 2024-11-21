package secao13.a135;

public class OutsorcedEmployee extends Employee implements EmployeeAtb{
    OutsorcedEmployee(String name, int hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
    }

    @Override
    public Double payment() {
        return (hours * valuePerHour) * 1.1;
    }
}
