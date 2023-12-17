package model.animals;


import java.time.LocalDate;

public class Dogs extends Pets{
    public Dogs(String name, LocalDate birthDate) {
        super(name, birthDate);
        getLearnable_commands().add("Сидеть по команде");
        getLearnable_commands().add("Стоять по команде");
        getLearnable_commands().add("Приносить брошенный предмет");
        getLearnable_commands().add("Давать лапу");
        getLearnable_commands().add("Лаять по команде");
        getLearnable_commands().add("Перекатываться по команде");
    }

    @Override
    public String toString() {
        return  this.getId()
                + ". Собака по имени "
                + this.getName()
                + ", родилась "
                + this.getBirthDate();
    }
}
