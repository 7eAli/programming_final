package model.animal_shelter;

import model.animals.Animal;

import java.util.Iterator;
import java.util.List;

public class Animal_shelter_iterator implements Iterator<Animal> {
    private int index;
    private List<Animal> animals;

    public Animal_shelter_iterator(List<Animal> animals) {
        this.index = index;
        this.animals = animals;
    }

    @Override
    public boolean hasNext() {
        return animals.size() > index;
    }

    @Override
    public Animal next() {
        return animals.get(index++);
    }
}
