package model.animals;

import java.time.LocalDate;

public class Camels extends Pack_animals{
    public Camels(String name, LocalDate birthDate) {
        super(name, birthDate);
        getLearnable_commands().add("Медленно идти");
        getLearnable_commands().add("Нести груз");
        getLearnable_commands().add("Садиться по команде");
        getLearnable_commands().add("Быстро бежать");
    }

    @Override
    public String toString() {
        return  this.getId()
                + ". Верблюд по имени "
                + this.getName()
                + " родился "
                + this.getBirthDate();
    }
}
