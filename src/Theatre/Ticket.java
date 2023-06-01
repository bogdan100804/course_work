package Theatre;

import Interfaces.TheatreDemo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ticket extends Spectacle implements TheatreDemo.Ticket {
    private LocalTime time;
    private int seatNumber;

    public Ticket(String title, Director director, double duration, List<Actor> actors, LocalDate date, String genre, double ticketPrice, LocalTime time) {
        super(title, director, duration, actors, date, genre, ticketPrice);
        this.time = time;
    }

    public double showTicketPrice(){
        System.out.println("Вартість квитка становить: " + super.getTicketPrice());
        return super.getTicketPrice();
    }

    public void showSpectacle(){
        System.out.println("Прем'єра на яку продаються квитки: " + super.getTitle());
    }

    public void isTicket(int tickets){
        if (tickets > 0) {
            System.out.println("Кількість доступних квитків: " + tickets);
        } else if (tickets == 0) {
            System.out.println("Немає доступних квитків!");
        }
    }

    public void showSeatNumber(){
        Random rand = new Random();
        seatNumber = rand.nextInt(120) + 1;
        System.out.println("Номер вашого місця: " + seatNumber);

    }

    public void showTime(){
        System.out.println("Дата на яку запланована вистава: " + super.getDate() + ", час проведення: " + time);
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket("Кайдашева сім'я", new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська"), 3.5, new ArrayList<>(), LocalDate.now(),"Комедія", 340.0, LocalTime.now());
        ticket.showTicketPrice();
        System.out.println();
        ticket.showSpectacle();
        System.out.println();
        ticket.isTicket(70);
        System.out.println();
        ticket.showSeatNumber();
        System.out.println();
        ticket.showTime();

    }
}
