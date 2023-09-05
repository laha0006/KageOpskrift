import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int ANTAL_PERSONER = 2;
        final int NYT_ANTAL_PERSONER = 2;

        System.out.println("Kage? KAAAAAGGGEEEEEEEE!");
        /*
        instansiere ingrediens objekter.
        Med de argumenter vi har defineret i Ingrediens klassens konstruktør
        Type, Mændge, Enhed,oprindeligeAntalPersoner,kcal,vægtPrEnhed
        Konstruktøren er “overloaded” dvs. Vi har 2 konstruktøren, en som ikke
        Tager vægtPrEnhed, så hvis det sidste argument undlades, så bliver vægtPrEnehed = 1
        */
        Ingrediens ingrediens1 = new Ingrediens("Æg", 2, "Styk", ANTAL_PERSONER, 108, 50);
        Ingrediens ingrediens2 = new Ingrediens("Mel", 400, "gram", ANTAL_PERSONER, 1456);
        Ingrediens ingrediens3 = new Ingrediens("Vand", 500, "milliliter", ANTAL_PERSONER, 0);
        Ingrediens ingrediens4 = new Ingrediens("Salt", 2, "tsk.", ANTAL_PERSONER, 0, 10);

        //en liste af typen Ingrediens (den klasse vi har defineret)
        //bliver sat = {ingrediens1,...} altså vi sætter listen til at være lig med
        //vores 4 ingrediens objekter.
        Ingrediens[] ingrediensList = {ingrediens1, ingrediens2, ingrediens3, ingrediens4};

        //instansiere et opskrift objekt, som vi giver 2 arugmenter
        //Først et navn til opskriftet, og derefter den liste med ingredienser
        //vi har defineret for oven.
        Opskrift opskrift = new Opskrift("Dej", ingrediensList);

        //print opskrift data ud.
        System.out.println("\nTil 2 personer: ");
        opskrift.printOpskrift();

        //sæt et nyt antal personer og print igen.
        opskrift.setAntal(4);
        System.out.println("\nTil 4 Personer: ");
        opskrift.printOpskrift();
    }
}