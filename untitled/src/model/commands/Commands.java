package model.commands;

import model.animals.Animal;

public class Commands {
    public String showLearnableCommands(Animal animal) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(animal.getName()).append(" может выучить: \n");
        for (String command : animal.getLearnable_commands()) {
            stringBuilder.append(command).append("\n");
        }
        return stringBuilder.toString();
    }
    public String showLearnedCommands(Animal animal) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(animal.getName()).append(" умеет: \n");
        for (String command : animal.getLearned_commands()) {
            stringBuilder.append(command).append("\n");
        }
        return stringBuilder.toString();
    }
    public void learnCommand(Animal animal, int command_id) {
        animal.getLearned_commands().add(animal.getLearnable_commands().get(command_id - 1));
        animal.getLearnable_commands().remove(command_id - 1);
    }
}
