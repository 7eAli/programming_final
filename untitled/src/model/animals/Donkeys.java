package model.animals;

import java.time.LocalDate;

public class Donkeys extends Pack_animals{

    public Donkeys(String name, LocalDate birthDate) {
        super(name, birthDate);
        getLearnable_commands().add("Медленно идти");
        getLearnable_commands().add("Нести груз");
        getLearnable_commands().add("Реветь по команде");
        getLearnable_commands().add("Бить задними копытами по команде");
    }

    @Override
    public String toString() {
        return  this.getId()
                + ". Осёл по имени "
                + this.getName()
                + " родился "
                + this.getBirthDate();
    }
}
