package ru.lessons.andrey;

import ru.lessons.andrey.model.Employer;
import ru.lessons.andrey.model.Handler;
import ru.lessons.andrey.model.Person;

/**
 * Chapter1 - класс отвечающий за что то.
 */
public class Chapter1 {

    /**
     * это точка входа в приложение.
     * @param args - аргументы
     */
    public static void main(String[] args) {

        Person person = new Person("Ivan", 37);

        Employer andrey = new Employer("Andrey", 26, "engeneir");
        System.out.println(andrey.getColor());

//        System.out.println(person.getName());
//
//        System.out.println(andrey.getName());
//        System.out.println(andrey.getProfession());

        Handler handerl = new Handler("Hnadler", 50, "jkdjf");
//        Employer brain = new Brain("Brain", 30, "braindler");
        System.out.println(handerl.getKnowable());
    }
}
