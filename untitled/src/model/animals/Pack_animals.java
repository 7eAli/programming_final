package model.animals;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public abstract class Pack_animals extends Animal{
    public Pack_animals(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
