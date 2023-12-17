package model.animal_shelter;

import model.animals.Animal;
import model.commands.Commands;

import java.time.LocalDate;
import java.util.Date;

public class Service {
    private Animal_shelter shelter;
    private Commands commands;

    public Service(Animal_shelter shelter, Commands commands) {

        this.shelter = shelter;
        this.commands = commands;
    }

    public String addAnimal(String animal_type, String animal_name, LocalDate animal_birthday) {
        return shelter.addAnimal(animal_type, animal_name, animal_birthday);
    }

    public String showLearnableCommands(int animal_id) {
        return commands.showLearnableCommands(shelter.getAnimal(animal_id - 1));
    }

    public String showLearnedCommands(int animal_id) {
        return commands.showLearnedCommands(shelter.getAnimal(animal_id - 1));
    }

    public void learnCommand(int animal_id, int command_id) {
        commands.learnCommand(shelter.getAnimal(animal_id - 1), command_id);
    }

    public void sortByDate() {shelter.sortByDate();}

    public void sortByID() {shelter.sortByID();}

    public String animalCountInfo() {
        return "Собак: " + shelter.getDogCount() + "\n" +
                "Кошек: " + shelter.getCatCount() + "\n" +
                "Хомяков: " + shelter.getHamsterCount() + "\n" +
                "Лошадей: " + shelter.getHorseCount() + "\n" +
                "Верблюдов: " + shelter.getCamelCount() + "\n" +
                "Ослов: " + shelter.getDonkeyCount() + "\n";
    }

    public String getAnimalInfo(int animal_id) {
        return shelter.getAnimal(animal_id - 1).toString();
    }

    public String getShelterInfo() {
        return shelter.shelterInfo();
    }
}
