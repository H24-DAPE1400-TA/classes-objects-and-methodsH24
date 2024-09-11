package metoder;

    /* Tanken her er at istedet for å skrive koden som er kommentert ut nederst, som tar lang tid og bryter DRY-prinsippene, lager vi
en metode - regnestykke(). Regnestykke-metoden som ligger øverst i Main-klassen lar oss ta inn en tallverdi og gjennomføre
alle matte-stegene automatisk. Dette gjør det også enklere å gjøre endringer på koden, siden vi kun må gjøre endringer en gang.

Metoden er markert som static siden vi ikke trenger å opprette et objekt, og void siden vi ikke returnerer noe på slutten av metoden.
 I parantesen til slutt finner vi verdien metoden tar inn (en integer). Denne kan, men må ikke, hete det samme som verdien
 vi tar inn når vi kaller på metoden i main. F.eks. ser vi at regnestykke() på linje 19 tar inn tall1, regnestykke på linje 20
  tar inn tall2 osv. Men inne i metoden blir tall1, tall2 osv referert til "siffer" og det er det metoden forholder seg til deretter.
 */



public class Main {
   static void regnestykke(int siffer){
       siffer -= 2;
       siffer += 2;
       siffer /= 2;
       siffer *= 2;
       siffer %= 2;
       System.out.println(siffer);
    }

    public static void main(String[] args) {
        int tall1 = 4;
        int tall2 = 8;
        int tall3 = 12;
        int tall4 = 16;
       regnestykke(tall1);
       regnestykke(tall2);
       regnestykke(tall3);
       regnestykke(tall4);

/*
        tall1 -= 2;
        tall1 += 2;
        tall1 /= 2;
        tall1 *= 2;
        tall1 %= 2;
        System.out.println(tall1);

        tall2 -= 2;
        tall2 += 2;
        tall2 /= 2;
        tall2 *= 2;
        tall2 %= 2;
        System.out.println(tall2);

        tall3 -= 2;
        tall3 += 2;
        tall3 /= 2;
        tall3 *= 2;
        tall3 %= 2;
        System.out.println(tall3);

        tall4 -= 2;
        tall4 += 2;
        tall4 /= 2;
        tall4 %= 2;
        System.out.println(tall4);
*/
    }
}