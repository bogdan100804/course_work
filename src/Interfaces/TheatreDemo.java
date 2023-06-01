package Interfaces;

import Theatre.Spectacle;
import Theatre.Ticket;

public interface TheatreDemo {
    public interface Actor {
        public String toString();
        public void addRoles();
        public void addHobbies();
        public void addAwards();
        public void addLanguages();
        public void infoAboutRoles();
        public void infoAboutHobbies();
        public void infoAboutAwards();
        public void infoAboutLanguages();
    }
    public interface Spectacle {
        public String showTitle();
        public String showDirector();
        public void infoFromTicket();
        public void listOfActors();
        public void showActors();
    }

    public interface Ticket {
        public double showTicketPrice();
        public void showSpectacle();
        public void isTicket(int tickets);
        public void showSeatNumber();
        public void showTime();
    }

    public interface CashRegister {
        public Theatre.Ticket sellTicket();
        public void cancelSpectacle();
        public double calculateRevenue();
        public void newSpectacle(Theatre.Spectacle spectacle);

    }

    public interface Director {
        public void award();
        public String toString();
        public void showAwards();

    }

    public interface Hall {
        public String showName();
        public int showRows();
        public void price();
        public String cleaning();
        public double calculateArea();
        public void showYourPlace();
    }
}
