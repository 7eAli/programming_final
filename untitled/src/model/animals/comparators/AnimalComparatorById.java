package model.animals.comparators;

import model.animals.Animal;

import java.util.Comparator;

public class AnimalComparatorById implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
