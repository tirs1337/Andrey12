package ru.lessons.andrey.model;

/**
 * Класс человек(персона).
 */
public class Person {

    /**
     * kjdkfjd.
     */
    private String name;

    /**
     * jkdfjdf.
     */
    private int age;

    /**
     * jfdkfjdf.
     */
    private String color;

    /**
     * jfkdfjd.
     */
    private String hear;

    /**
     * jkdjfdf.
     */
    private int size;

    /**
     * kfdjfkdfj.
     * @param name - jdkfjd
     * @param age - kjfdkjf
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//

    /**
     * jdkjfdf.
     * @param recieverName - jfkdjfd
     * @return - fjdkfj
     */
    public String getName(String recieverName) {
        if (recieverName.equals("dinis")) {
            return "ничего не скажу";
        }
        return name;
    }

    /**
     * jkfdjfdkjf.
     * @param name - jfdkfj
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * jfkdjfdf.
     * @return - jfdkf
     */
    public int getAge() {
        return age;
    }

    /**
     * jfdkfjdk.
     * @param age - kfjdkf
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * fkdjfkdfj.
     * @return - kjkdjf
     */
    public String getColor() {
        return color;
    }

    /**
     * jfkdfjdjf.
     * @param color - jfkdjf
     */
    protected void setColor(String color) {
        this.color = color;
    }

    /**
     * jfdkfjdkfjd.
     * @return - jdkjfkdjf
     */
    public String getHear() {
        return hear;
    }

    /**
     * jfdkjfdkfjd.
     * @param hear - jfdkjfdk
     */
    public void setHear(String hear) {
        this.hear = hear;
    }

    /**
     * jkdfjfkdjf.
     * @return - jdkjfd
     */
    public int getSize() {
        return size;
    }

    /**
     * jdkjfdkfjd.
     * @param size - jfdkfjd
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * jfkdfjdkfj.
     * @return - kfjdkfjk
     */
    public String getKnowable() {
        return "Шофер";
    }
}
