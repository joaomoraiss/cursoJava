package secao12.a126;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String name, email;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(name+ " ("+birthDate.format(dtf)+")"+" Email: "+email);
        return str.toString();
    }
}
