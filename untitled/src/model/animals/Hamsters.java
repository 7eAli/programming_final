package model.animals;

import java.time.LocalDate;

public class Hamsters extends Pets{

    public Hamsters(String name, LocalDate birthDate) {
        super(name, birthDate);
        getLearnable_commands().add("Прятаться по команде");
        getLearnable_commands().add("Крутиться по команде");
        getLearnable_commands().add("Перекатываться по команде");
    }

    @Override
    public String toString() {
        return  this.getId()
                + ". Хомяк по имени "
                + this.getName()
                + " родился "
                + this.getBirthDate();
    }
}
