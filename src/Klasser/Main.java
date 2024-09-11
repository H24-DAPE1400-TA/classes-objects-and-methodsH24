package Klasser;

import java.sql.SQLOutput;

class AirlineTicket{
    String passengerName;
    String departure;
    String destination;
    int timeToDeparture;
    static int numberOfTickets;


    public void ticketInfo(){
        System.out.println("The passenger is named "+passengerName);
        System.out.println("They are travelling to "+destination);
        System.out.println("The plane leaves in "+timeToDeparture + " minutes. You're late.");
    }
}

public class Main {
    public static void main(String[] args) {
        //Milano (Ikke Iran)
        AirlineTicket ticket1 = new AirlineTicket();
        ticket1.passengerName = "Zuzanna";
        ticket1.departure = "Oslo";
        ticket1.destination = "Milano (Ikke Iran)";
        ticket1.timeToDeparture = 20;
        AirlineTicket.numberOfTickets ++;
        System.out.println(AirlineTicket.numberOfTickets);
        ticket1.ticketInfo();

        //Island
        AirlineTicket ticket2 = new AirlineTicket();
        ticket2.passengerName = "Oda";
        ticket2.departure = "Oslo";
        ticket2.destination = "Reykjavik";
        ticket2.timeToDeparture = 60;
        AirlineTicket.numberOfTickets ++;
        System.out.println(AirlineTicket.numberOfTickets);
        ticket2.ticketInfo();

        //Duplikat objekt går fint
        AirlineTicket ticket3 = new AirlineTicket();
        ticket3.passengerName = "Oda";
        ticket3.departure = "Oslo";
        ticket3.destination = "Reykjavik";
        ticket3.timeToDeparture = 60;
        AirlineTicket.numberOfTickets ++;
        System.out.println(AirlineTicket.numberOfTickets);

    }
}
