package Metoder;

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


//        tall1 -= 2;
//        tall1 += 2;
//        tall1 /= 2;
//        tall1 *= 2;
//        tall1 %= 2;
//        System.out.println(tall1);
//
//        tall2 -= 2;
//        tall2 += 2;
//        tall2 /= 2;
//        tall2 *= 2;
//        tall2 %= 2;
//        System.out.println(tall2);
//
//        tall3 -= 2;
//        tall3 += 2;
//        tall3 /= 2;
//        tall3 *= 2;
//        tall3 %= 2;
//        System.out.println(tall3);
//
//        tall4 -= 2;
//        tall4 += 2;
//        tall4 /= 2;
//        tall4 %= 2;
//        System.out.println(tall4);

    }
}