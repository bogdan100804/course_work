package Theatre;

import Interfaces.TheatreDemo;

import java.util.ArrayList;
import java.util.List;

public class Director implements TheatreDemo.Director {
    private String name;
    private int age;
    private String gender;
    private String nationality;
    private List awards;

    public Director(String name, int age, String gender, String nationality) {
        awards = new ArrayList<>();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    public void award(){
        awards.add("Золота пальмова гілка Канського");
        awards.add("Національна театральна премія імені Тараса Шевченка");
        awards.add("Міжнародний фестиваль театрів «Золота Хмара»");
        awards.add("Фестиваль «Мельпомена Таврії»");
        awards.add("Фестиваль «Театральні зустрічі на Волині» ");
    }

    @Override
    public String toString() {
        return "Імя режисера: " + name + "\n" +
                "Вік: " + age + "\n" +
                "Стать: " + gender + "\n" +
                "Національність: " + nationality + "\n";
    }

    public void showAwards(){
        award();
        System.out.println("Нагороди " + name + ": ");
        for (Object s: awards){
            System.out.println("- " + s + ";");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List getAwards() {
        return awards;
    }

    public void setAwards(List awards) {
        this.awards = awards;
    }

    public static void main(String[] args) {
        Director director = new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська");
        System.out.println(director.toString());
        director.showAwards();
    }
}
