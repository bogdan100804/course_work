package Theatre;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MainTheatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Гарік Бірча", 48, 15.6, new ArrayList<>(), new ArrayList<>(), "Центральноукраїнський державний педагогічний університет імені Володимира Винниченка", new ArrayList<>(), new ArrayList<>());
        Spectacle spectacle = new Spectacle("Кайдашева сім'я", new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська"), 3.5, new ArrayList<>(), LocalDate.now(),"Комедія", 340.0);
        Ticket ticket = new Ticket("Кайдашева сім'я", new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська"), 3.5, new ArrayList<>(), LocalDate.now(),"Комедія", 340.0, LocalTime.now());
        CashRegister cashRegister = new CashRegister(true, false);
        Director director = new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська");
        Hall hall = new Hall("Великий зал", 8, 15, new Ticket("Кайдашева сім'я", new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська"), 3.5, new ArrayList<>(), LocalDate.now(),"Комедія", 340.0, LocalTime.now()), "08.05.23");

        System.out.println("_________________________________________________________________________________________________");


        System.out.println(actor1.infoAboutActor());
        actor1.infoAboutAwards();
        actor1.infoAboutRoles();
        actor1.infoAboutHobbies();
        actor1.infoAboutLanguages();

        System.out.println("_________________________________________________________________________________________________");

        spectacle.showTitle();
        spectacle.showDirector();
        spectacle.infoFromTicket();
        spectacle.showActors();

        System.out.println("_________________________________________________________________________________________________");

        ticket.showTicketPrice();
        ticket.showSpectacle();
        ticket.isTicket(70);
        ticket.showSeatNumber();
        ticket.showTime();

        System.out.println("_________________________________________________________________________________________________");

        cashRegister.sellTicket();
        System.out.println();
        cashRegister.cancelSpectacle();
        System.out.println();
        cashRegister.newSpectacle(new Spectacle("Ой не ходи, Грицю, та й на вечорниці", new Director("Дмитро Чирипюк", 46, "Чоловіча", "Українська"), 3.5, new ArrayList<>(), LocalDate.now(),"Комедія", 340.0));

        System.out.println("_________________________________________________________________________________________________");

        System.out.println(director.toString());
        director.showAwards();

        System.out.println("_________________________________________________________________________________________________");

        hall.showName();
        hall.showRows();
        hall.price();
        hall.cleaning();
        hall.calculateArea();
        hall.showYourPlace();

        System.out.println("_________________________________________________________________________________________________");


    }
}
