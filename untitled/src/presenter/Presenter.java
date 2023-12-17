package presenter;

import model.animal_shelter.Animal_shelter;
import model.animal_shelter.Service;
import model.commands.Commands;
import view.View;

import java.time.LocalDate;
import java.util.Date;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service(new Animal_shelter(), new Commands());
    }

    public String addAnimal(String animal_type, String animal_name, LocalDate animal_birthday) {
        return service.addAnimal(animal_type, animal_name, animal_birthday);
    }

    public String showLearnableCommands(int animal_id) {
        return service.showLearnableCommands(animal_id);
    }

    public String showLearnedCommands(int animal_id) {
        return service.showLearnedCommands(animal_id);
    }

    public void learnCommand(int animal_id, int command_id) {
        service.learnCommand(animal_id, command_id);
    }

    public void sortByDate() {
        service.sortByDate();
    }
    public void sortByID() {
        service.sortByID();
    }

    public String animalCountInfo() {
        return service.animalCountInfo();
    }

    public String getAnimalInfo(int animal_id) {
        return service.getAnimalInfo(animal_id);
    }

    public String getShelterInfo() {
        return  service.getShelterInfo();
    }
}
