package model.animals;

import java.time.LocalDate;

public class Cats extends Pets{
    public Cats(String name, LocalDate birthDate) {
        super(name, birthDate);
        getLearnable_commands().add("Сидеть по команде");
        getLearnable_commands().add("Наскакивать по команде");
        getLearnable_commands().add("Царапать по команде");
        getLearnable_commands().add("Мяукать по команде");
        getLearnable_commands().add("Прыгать по команде");
    }

    @Override
    public String toString() {
        return  this.getId()
                + ". Кошка по имени "
                + this.getName()
                + " родилась "
                + this.getBirthDate();
    }
}
