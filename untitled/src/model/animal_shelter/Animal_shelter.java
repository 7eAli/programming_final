package model.animal_shelter;

import model.animals.*;
import model.animals.comparators.AnimalComparatorByDate;
import model.animals.comparators.AnimalComparatorById;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Animal_shelter implements Iterable<Animal>{
    private ArrayList<Animal> shelter;
    private Integer animalId;
    private Integer dogCount;
    private Integer catCount;
    private Integer hamsterCount;
    private Integer horseCount;
    private Integer camelCount;
    private Integer donkeyCount;

    public Animal_shelter() {
        shelter = new ArrayList<>();
        dogCount = 0;
        catCount = 0;
        hamsterCount = 0;
        horseCount = 0;
        camelCount = 0;
        donkeyCount = 0;
        animalId = 1;
    }

    public Integer getDogCount() {
        return dogCount;
    }

    public Integer getCatCount() {
        return catCount;
    }

    public Integer getHamsterCount() {
        return hamsterCount;
    }

    public Integer getHorseCount() {
        return horseCount;
    }

    public Integer getCamelCount() {
        return camelCount;
    }

    public Integer getDonkeyCount() {
        return donkeyCount;
    }

    public Animal getAnimal(int id) {
        return shelter.get(id);
    }

    public String addAnimal(String animal_type, String animal_name, LocalDate animal_birthday) {
        String result = null;
        switch (animal_type.toLowerCase()) {
            case("dog") -> {
                Dogs dog = new Dogs(animal_name, animal_birthday);
                if (!shelter.contains(dog)) {
                    shelter.add(dog);
                    dog.setId(animalId++);
                    dogCount++;
                    result = "Пес успешно добавлен";
                } else result = "Такой пес уже есть";
            }
            case ("cat") -> {
                Cats cat = new Cats(animal_name, animal_birthday);
                if (!shelter.contains(cat)) {
                    shelter.add(cat);
                    cat.setId(animalId++);
                    catCount++;
                    result = "Кот успешно добавлен";
                } else result = "Такой кот уже есть";
            }
            case ("hamster") -> {
                Hamsters hamster = new Hamsters(animal_name, animal_birthday);
                if (!shelter.contains(hamster)) {
                    shelter.add(hamster);
                    hamster.setId(animalId++);
                    hamsterCount++;
                    result = "Хомяк успешно добавлен";
                } else result = "Такой хомяк уже есть";
            }
            case ("horse") -> {
                Horses horse = new Horses(animal_name, animal_birthday);
                if (!shelter.contains(horse)) {
                    shelter.add(horse);
                    horse.setId(animalId++);
                    horseCount++;
                    result = "Лошадь успешно добавлена";
                } else result = "Такая лошадь уже есть";
            }
            case ("camel") -> {
                Camels camel = new Camels(animal_name, animal_birthday);
                if (!shelter.contains(camel)) {
                    shelter.add(camel);
                    camel.setId(animalId++);
                    camelCount++;
                    result = "Верблюд успешно добавлен";
                } else result = "Такой верблюд уже есть";
            }
            case ("donkey") -> {
                Donkeys donkey = new Donkeys(animal_name, animal_birthday);
                if (!shelter.contains(donkey)) {
                    shelter.add(donkey);
                    donkey.setId(animalId++);
                    donkeyCount++;
                    result = "Осёл успешно добавлен";
                } else result = "Такой осёл уже есть";
            }
            default -> result = "Таких животных в приюте нет";
        }
        return result;
    }

    public String shelterInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Animal animal : shelter) {
            stringBuilder.append(animal.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByDate() {shelter.sort(new AnimalComparatorByDate());}

    public void sortByID() {shelter.sort(new AnimalComparatorById());}

    @Override
    public String toString() {
        return this.shelterInfo();
    }

    @Override
    public Iterator<Animal> iterator() {
        return new Animal_shelter_iterator(shelter);
    }
}
