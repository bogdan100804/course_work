package Theatre;

import Interfaces.TheatreDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Spectacle implements TheatreDemo.Spectacle {
    private String title;
    private Director director;
    private double duration;
    private List<Actor> actors;
    private LocalDate date;
    private String genre;
    private double ticketPrice;

    public Spectacle(String title, Director director, double duration, List<Actor> actors, LocalDate date, String genre, double ticketPrice) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.actors = actors;
        this.date = date;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    public String showTitle(){
        System.out.println("Назва сьогоднішньої прем'єри: " + title);
        return title;
    }

    public String showDirector(){
        System.out.println("Режисер прем'єри: " + director.getName());
        return director.getName();

    }

    public void infoFromTicket(){
        System.out.println("Дата проведення: " + date + "\n" +
                "Тривалість: " + duration + " год." + "\n" +
                "Жанр: " + genre + "\n" +
                "Ціна квитка: " + ticketPrice + " грн.");
    }

    public void listOfActors(){
        actors.add(new Actor("Віктор Андрієнко"));
        actors.add(new Actor("Ольга Сумська"));
        actors.add(new Actor("Олексій Тритенко"));
        actors.add(new Actor("Григорій Бакланов"));
        actors.add(new Actor("Дар'я Легейда"));
        actors.add(new Actor("Марк Дробот"));
        actors.add(new Actor("Денисенко Наталія"));
        actors.add(new Actor("Олексій Богданович"));
        actors.add(new Actor("Наталія Сумська"));
        actors.add(new Actor("Вітовська-Ванца Ірма"));

    }

    public void showActors(){
        listOfActors();
        System.out.println("Актори, які беруть участь у прем'єрі: ");
        for (Object o: actors) {
            System.out.println("- " + o + ";");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public static void main(String[] args) {
        Spectacle spectacle = new Spectacle("Кайдашева сім'я", new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська"), 3.5, new ArrayList<>(), LocalDate.now(),"Комедія", 340.0);
        spectacle.showTitle();
        System.out.println();
        spectacle.showDirector();
        System.out.println();
        spectacle.infoFromTicket();
        System.out.println();
        spectacle.showActors();
    }
}
