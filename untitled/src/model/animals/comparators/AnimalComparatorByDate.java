package model.animals.comparators;

import model.animals.Animal;

import java.util.Comparator;

public class AnimalComparatorByDate implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
