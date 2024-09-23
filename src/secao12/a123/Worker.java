package secao12.a123;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private ArrayList<HourContrat> contratos = new ArrayList<>();
    private Departament departament;

    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContrat contrat){
       contratos.add(contrat);
    }
    public void removeContrat(HourContrat contrat){
        for (HourContrat c : contratos) if (c.equals(contrat)) contratos.remove(contrat);
    }
    public double income(Integer year, Integer month){
        double salary = baseSalary;
        for (HourContrat c : contratos){
            if (c.getDate().getYear() == year && c.getDate().getMonthValue() == month){
                salary += c.totalValue();
            }
        }
        return salary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String toString(){
        return "Nome: "+name+"\n"+
                "Level: "+level+"\n"+
                "Salario base: "+baseSalary;
    }
}
