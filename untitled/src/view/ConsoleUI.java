package view;

import presenter.Presenter;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean working;

    public ConsoleUI() {
        scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        presenter = new Presenter(this);
        working = true;
    }

    public void addAnimal() {
        System.out.println("Введите вид животного");
        String type = scanner.nextLine();
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите год рождения:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите месяц рождения (в виде числа):");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите день рождения:");
        int day = Integer.parseInt(scanner.nextLine());
        LocalDate birthDate = LocalDate.of(year, month, day);
        System.out.println(presenter.addAnimal(type, name, birthDate));
    }

    public void showLearnableCommands() {
        System.out.println(presenter.getShelterInfo());
        System.out.println("Введите номер животного");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(presenter.showLearnableCommands(id));
    }

    public void showLearnedCommands() {
        System.out.println(presenter.getShelterInfo());
        System.out.println("Введите номер животного");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(presenter.showLearnedCommands(id));
    }

    public void learnCommand() {
        System.out.println(presenter.getShelterInfo());
        System.out.println("Введите номер животного");
        int animal_id = Integer.parseInt(scanner.nextLine());
        System.out.println(presenter.showLearnableCommands(animal_id));
        System.out.println("Введите номер команды");
        int command_id = Integer.parseInt(scanner.nextLine());
        presenter.learnCommand(animal_id, command_id);
    }

    public void sortByDate() {
        presenter.sortByDate();
    }

    public void sortByID() {
        presenter.sortByID();
    }

    public void showAnimalCount() {
        System.out.println(presenter.animalCountInfo());
    }

    public void showShelterInfo() {
        System.out.println(presenter.getShelterInfo());
    }


    @Override
    public void work() {
        String command = scanner.nextLine();
        if (command.matches("[0-9]+")) {
            switch (command) {
                case ("1") -> {
                    showShelterInfo();
                }
                case ("2") -> {
                    addAnimal();
                }
                case ("3") -> {
                    showLearnableCommands();
                }
                case ("4") -> {
                    showLearnedCommands();
                }
                case ("5") -> {
                    learnCommand();
                }
                case ("6") -> {
                    sortByDate();
                }
                case ("7") -> {
                    sortByID();
                }
                case ("8") -> {
                    showAnimalCount();
                }
                case ("9") -> {
                    finish();
                }
                default -> {
                    System.out.println("Нет такой команды");
                }
            }
        }
    }

    @Override
    public void start() {
        System.out.println("Здравствуйте");
        while (working) {
            System.out.println("1. Информация о животных\n");
            System.out.println("2. Добавить животное\n");
            System.out.println("3. Вывести информацию о доступных животному командах\n");
            System.out.println("4. Вывести информацию о командах, известных животному\n");
            System.out.println("5. Научить животное команде\n");
            System.out.println("6. Отсортировать животных по дате \n");
            System.out.println("7. Отсортировать животных по порядку добавления\n");
            System.out.println("8. Вывести информацию о количестве разных животных\n");
            System.out.println("9. Выйти из программы\n");
            work();
        }
    }

    @Override
    public void finish() {
        System.out.println("До свидания");
        working = false;
    }
}
