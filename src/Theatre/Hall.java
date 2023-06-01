package Theatre;

import Interfaces.TheatreDemo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Hall implements TheatreDemo.Hall {
    private String name;
    private int rows;
    private int placesInRow;
    private Ticket ticket;
    private String dateOfLastCleaning;

    public Hall(String name, int rows, int placesInRow, Ticket ticket, String dateOfLastCleaning) {
        this.name = name;
        this.rows = rows;
        this.ticket = ticket;
        this.placesInRow = placesInRow;
        this.dateOfLastCleaning = dateOfLastCleaning;
    }

    public String showName(){
        System.out.println("Назва цієї зали: " + name);
        return name;
    }

    public int showRows(){
        System.out.println("Кількість рядів у залі: " + rows + "\n"
        + "Кількість місць у ряді: " + placesInRow);
        return rows;
    }

    public void price(){
        System.out.println("Ціна квитка у цій залі: " + ticket.getTicketPrice());
    }

    public String cleaning(){
        System.out.println("Дата останнього прибирання: " + dateOfLastCleaning);
        return dateOfLastCleaning;
    }

    public double calculateArea() {
        double length = 13.0; // довжина залу у метрах
        double width = 9.0; // ширина залу у метрах
        double area = length * width;
        System.out.println("Площа зали становить: " + area + " м²");
        return area;
    }

    public void showYourPlace(){
        ticket.showSeatNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPlacesInRow() {
        return placesInRow;
    }

    public void setPlacesInRow(int placesInRow) {
        this.placesInRow = placesInRow;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getDateOfLastCleaning() {
        return dateOfLastCleaning;
    }

    public void setDateOfLastCleaning(String dateOfLastCleaning) {
        this.dateOfLastCleaning = dateOfLastCleaning;
    }

    public static void main(String[] args) {
        Hall hall = new Hall("Великий зал", 8, 15, new Ticket("Кайдашева сім'я", new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська"), 3.5, new ArrayList<>(), LocalDate.now(),"Комедія", 340.0, LocalTime.now()), "08.05.23");
        hall.showName();
        hall.showRows();
        hall.price();
        hall.cleaning();
        hall.calculateArea();
        hall.showYourPlace();
    }
}
