package Theatre;

import Interfaces.TheatreDemo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CashRegister implements TheatreDemo.CashRegister {
    private List<Ticket> soldTickets;
    private Spectacle currentSpectacle;
    private LocalDate currentDate;
    private LocalTime currentTime;
    private boolean isSoldOut;
    private boolean cancel;

    // Конструктор класу
    public CashRegister(boolean isSoldOut, boolean cancel) {
        soldTickets = new ArrayList<>();
        this.isSoldOut = isSoldOut;
        this.cancel = cancel;
    }

    // Метод, що продажує квиток на поточну виставу
    public Ticket sellTicket() {
        Ticket ticket = new Ticket("Кайдашева сім'я", new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська"), 3.5, new ArrayList<>(), LocalDate.now(),"Комедія", 340.0, LocalTime.now());
        if (isSoldOut == true) {
            System.out.println("Вибачте, всі квитки продано!");
            for(int i = 0; i < 60; i++) {
                soldTickets.add(ticket);
            }
            calculateRevenue();

        } else {
            System.out.println("Ще маєте можливість придбати квитки");
        }
        return ticket;
    }

    // Метод, що скасовує виставу і повертає список проданих квитків
    public void cancelSpectacle() {
        if (cancel == true){
            System.out.println("Прем'єру скасовано!");
        } else {
            System.out.println("Прем'єру не скасовано! Чекаємо вас!");
        }

    }

    // Метод, що повертає загальний дохід від продажу квитків на поточну виставу
    public double calculateRevenue() {
        double totalRevenue = 0.0;
        for (Ticket ticket : soldTickets) {
            totalRevenue += ticket.getTicketPrice();
        }
        System.out.println("Кількість проданих квитків: " + soldTickets.size());
        System.out.println("Загальний дохід від продажу квитків на поточну прем'єру: " + totalRevenue);
        return totalRevenue;
    }

    public void newSpectacle(Spectacle spectacle){
        currentSpectacle = spectacle;
        currentDate = LocalDate.now();
        currentTime = LocalTime.now();
        System.out.println("Назва запланованої прем'єри: " + currentSpectacle.getTitle() +
                 "\n" + "Дата: " + currentDate +
                "\n" + "Час: " + currentTime);
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }

    public void setSoldOut(boolean soldOut) {
        isSoldOut = soldOut;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public List<Ticket> getSoldTickets() {
        return soldTickets;
    }

    public void setSoldTickets(List<Ticket> soldTickets) {
        this.soldTickets = soldTickets;
    }

    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister(false, false);
        cashRegister.sellTicket();
        System.out.println();
        cashRegister.cancelSpectacle();
        System.out.println();
        cashRegister.newSpectacle(new Spectacle("Ой не ходи, Грицю, та й на вечорниці", new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська"), 3.5, new ArrayList<>(), LocalDate.now(),"Комедія", 340.0));

    }
}
