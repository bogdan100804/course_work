package Theatre;

import Interfaces.TheatreDemo;

import java.util.ArrayList;
import java.util.List;

public class Actor implements TheatreDemo.Actor {
    private String name;
    private int age;
    private double experience;
    private List roles;
    private List hobbies;
    private String educationLevel;
    private List awards;
    private List languages;

    public Actor(String name, int age, double experience, List roles, List hobbies, String educationLevel, List awards, List languages) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.roles = roles;
        this.hobbies = hobbies;
        this.educationLevel = educationLevel;
        this.awards = awards;
        this.languages = languages;
    }

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ім'я актора: " + name;
    }

    public String infoAboutActor() {
        return "Ім'я актора: " + name + ";" + "\n" +
                "Вік: " + age + ";" + "\n" +
                "Досвід роботи на сцені: " + experience + " р." + ";" + "\n" +
                "Навчався в " + educationLevel + ";";
    }

    public void addRoles(){
        roles.add("Головний герой");
        roles.add("Комічний персонаж");
        roles.add("Драматичний персонаж");
        roles.add("Друг головного героя");
    }

    public void addHobbies(){
        hobbies.add("Гра у футбол");
        hobbies.add("Прогулянка парком");
        hobbies.add("Гра у баскетбол");
        hobbies.add("Риболовля");
        hobbies.add("Гірськолижний спорт");
    }

    public void addAwards(){
        awards.add("Кінопремія 'Золота Дзиґа'");
        awards.add("Золотий глобус");
        awards.add("Тоні");
        awards.add("Сезар");
        awards.add("Національна театральна премія 'Київська Пектораль'");
    }

    public void addLanguages(){
        languages.add("Українська");
        languages.add("Англійська");
        languages.add("Польська");

    }

    public void infoAboutRoles(){
        addRoles();
        System.out.println("Ролі в яких " + name + " здобув популярність: ");
        for (Object s: roles){
            System.out.println("- " + s + ";");
        }
    }

    public void infoAboutHobbies(){
        addHobbies();
        System.out.println("Хоббі актора: ");
        for (Object s: hobbies){
            System.out.println("- " + s + ";");
        }
    }

    public void infoAboutAwards(){
        addAwards();
        System.out.println("Гордість " + name + ":");
        for (Object s: awards){
            System.out.println("- " + s + ";");
        }
    }

    public void infoAboutLanguages(){
        addLanguages();
        System.out.println("Мови якими володіє " + name + ": ");
        for (Object s: languages){
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

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public List getRoles() {
        return roles;
    }

    public void setRoles(List roles) {
        this.roles = roles;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public List getAwards() {
        return awards;
    }

    public void setAwards(List awards) {
        this.awards = awards;
    }

    public List getLanguages() {
        return languages;
    }

    public void setLanguages(List languages) {
        this.languages = languages;
    }

    public static void main(String[] args) {
        Actor actor1 = new Actor("Гарік Бірча", 48, 15.6, new ArrayList<>(), new ArrayList<>(), "Центральноукраїнський державний педагогічний університет імені Володимира Винниченка", new ArrayList<>(), new ArrayList<>());
        System.out.println(actor1.infoAboutActor());
        System.out.println();
        actor1.infoAboutAwards();
        System.out.println();
        actor1.infoAboutRoles();
        System.out.println();
        actor1.infoAboutHobbies();
        System.out.println();
        actor1.infoAboutLanguages();
    }
}
