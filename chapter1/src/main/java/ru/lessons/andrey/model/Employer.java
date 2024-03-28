package ru.lessons.andrey.model;

/**
 * Класс рабочий.
 */
public class Employer extends Person {

    /**
     * profession.
     */
    private String profession;

    /**
     * kfjdkfjd.
     * @param name - fjdkf
     * @param age - fjdkf
     * @param profession - kfjdkfj
     */
    public Employer(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    /**
     * jjdkfjdkf.
     * @return - fdkfjdk
     */
    public String getProfession() {
        return profession;
    }

    /**
     * jkdjfd.
     * @param profession - fjdkfj
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }


    /**
     * jfdkjfd.
     * @return - fjdkfj
     */
    public String getKnowable() {
        return "Шофер + Повар";
    }
}
