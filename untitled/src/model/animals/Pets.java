package model.animals;

import java.time.LocalDate;
import java.util.Date;

public abstract class Pets extends Animal{
    public Pets(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
