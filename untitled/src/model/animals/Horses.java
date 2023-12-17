package model.animals;

import java.time.LocalDate;

public class Horses extends Pack_animals{

    public Horses(String name, LocalDate birthDate) {
        super(name, birthDate);
        getLearnable_commands().add("Скакать рысью");
        getLearnable_commands().add("Скакать легким галопом");
        getLearnable_commands().add("Скакать галопом");
        getLearnable_commands().add("Прыгать по команде");
    }

    @Override
    public String toString() {
        return  this.getId()
                + ". Лошадь по имени "
                + this.getName()
                + " родилась "
                + this.getBirthDate();
    }
}
