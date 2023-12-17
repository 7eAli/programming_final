package model.animals;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Animal implements Comparable<Animal>{
    private String name;
    private LocalDate birthDate;
    private Integer id;
    private ArrayList<String> learnable_commands;
    private ArrayList<String> learned_commands;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        learnable_commands = new ArrayList<>();
        learned_commands = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getId() {
        return id;
    }

    public ArrayList<String> getLearnable_commands() {
        return learnable_commands;
    }

    public void setLearnable_commands(ArrayList<String> learnable_commands) {
        this.learnable_commands = learnable_commands;
    }

    public ArrayList<String> getLearned_commands() {
        return learned_commands;
    }

    public void setLearned_commands(ArrayList<String> learned_commands) {
        this.learned_commands = learned_commands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        Period difference;
        int age = 0;
        difference = Period.between(birthDate, LocalDate.now());
        age = difference.getDays();
        return age;
    }
}
