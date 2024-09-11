package klasser;

/*Tanken her er at vi oppretter en klasse for å holde styr på flybilletter. Hver flybillett må ha sine egne variabler:
Navn, avreisested, destinasjon, og tid til flyet går. Dermed er det hensiktsmessig å opprette et nytt objekt for hver enkelt flybillett.

Samtidig vil vi også gjerne holde oversikt over hvor mange flybilletter vi har solgt. Dette tallet skal eksistere på tvers av
flybillettene - vi vil også ha tilgang på verdien selv om vi ikke har solgt noen flybilletter.
Derfor gjør vi int numberOfTickets _static_. En static verdi tilhører klassen og eksisterer uavhengig av billettene.
 */


//Her har vi opprettet klassen vår og definert attributtene vi vil ha for billettene (de fire første), og for klassen (den siste).
class AirlineTicket{
    String passengerName; //objekt-verdi
    String departure; //objekt-verdi
    String destination; //objekt-verdi
    int timeToDeparture; //objekt-verdi
    static int numberOfTickets = 0; //obs! Static, så klasse-verdi


    /*Under lager vi en liten metode som printer ut informasjon for hver enkelt billett ved behov. Merk at siden denne ikke er static,
    så vil den kun fungere for et objekt av type AirlineTicket, og vil printe ut relevant informasjon for den billetten.
    Eksempel på dette finnes i main-metoden.
     */

    public void ticketInfo(){
        System.out.println("The passenger is named "+passengerName);
        System.out.println("They are travelling to "+destination);
        System.out.println("The plane leaves in "+timeToDeparture + " minutes. You're late. \n");
    }
}

public class Main {
    public static void main(String[] args) {
        // Under oppretter vi en flybillett til Milano, takk til Zuzanna som deltok med reisemål!
        AirlineTicket ticket1 = new AirlineTicket();
        ticket1.passengerName = "Zuzanna";
        ticket1.departure = "Oslo";
        ticket1.destination = "Milano";
        ticket1.timeToDeparture = 20;

        //Under øker vi verdien til AirlineTicket-klassen sin statiske variabel for å holde styr på at vi har solgt en billett.
        AirlineTicket.numberOfTickets ++;
        System.out.println("Vi har solgt: " + AirlineTicket.numberOfTickets + " billetter");

        //Til slutt kaller vi på ticket1 sin ticketInfo-metode for å hente ut igjen informasjon om denne billetten.
        ticket1.ticketInfo();

        //Under oppretter vi en flybillett til Island, takk til Oda som deltok med reisemål!
        AirlineTicket ticket2 = new AirlineTicket();
        ticket2.passengerName = "Oda";
        ticket2.departure = "Oslo";
        ticket2.destination = "Reykjavik";
        ticket2.timeToDeparture = 60;

        //Under øker vi verdien til AirlineTicket-klassen sin statiske variabel for å holde styr på at vi har solgt en ny billett.
        AirlineTicket.numberOfTickets ++;
        System.out.println("Vi har solgt: " + AirlineTicket.numberOfTickets + " billetter");

        //Til slutt kaller vi på ticket1 sin ticketInfo-metode for å hente ut igjen informasjon om denne billetten.
        ticket2.ticketInfo();

        //Og vi gjentar Odas billett en gang til for å vise at objekter kan ha identiske verdier uten konflikt så
        // lenge objektnavnet er forskjellig.
        AirlineTicket ticket3 = new AirlineTicket();
        ticket3.passengerName = "Oda";
        ticket3.departure = "Oslo";
        ticket3.destination = "Reykjavik";
        ticket3.timeToDeparture = 60;
        AirlineTicket.numberOfTickets ++;
        ticket3.ticketInfo();
        System.out.println("Vi har solgt: " + AirlineTicket.numberOfTickets + " billetter");
    }
}
