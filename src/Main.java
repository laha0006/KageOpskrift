import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int ANTAL_PERSONER = 2;
        final int NYT_ANTAL_PERSONER = 2;

        System.out.println("Kage? KAAAAAGGGEEEEEEEE!");

        Ingrediens ingrediens1 = new Ingrediens("Æg", 2, "Styk", ANTAL_PERSONER, 108, 50);
        Ingrediens ingrediens2 = new Ingrediens("Mel", 400, "gram", ANTAL_PERSONER, 1456);
        Ingrediens ingrediens3 = new Ingrediens("Vand", 500, "milliliter", ANTAL_PERSONER, 0);
        Ingrediens ingrediens4 = new Ingrediens("Salt", 2, "tsk.", ANTAL_PERSONER, 0, 10);

        Ingrediens[] ingrediensList = {ingrediens1, ingrediens2, ingrediens3, ingrediens4};
        Opskrift opskrift = new Opskrift("Dej", ingrediensList);
        System.out.println("opskrift.beregnTotalVægt() = " + opskrift.beregnTotalVægt());
        opskrift.setAntal(4);
        System.out.println("opskrift.beregnTotalVægt() = " + opskrift.beregnTotalVægt());

        double totalVægt = 0;
        double totalKcal = 0;
        double totalKjoule = 0; // 4
        int count = ingrediensList.length;
        for (Ingrediens ing : ingrediensList) {
            ing.setAntal(NYT_ANTAL_PERSONER);
            System.out.println(ing.beregnMængde() + " "
                    + ing.getEnhed()
                    + " " + ing.getType()
                    + " vægt: " + ing.beregnVægt()
                    + " kcal: " + ing.beregnKcal()
                    + " kjoule: " + ing.beregnKjoule());
            totalVægt += ing.beregnVægt(); // totalVægt = totalVægt + ing.beregnVægt();
            totalKcal += ing.beregnKcal();
            totalKjoule += ing.beregnKjoule();
        }
        System.out.println();
        System.out.println("totalVægt = " + totalVægt);
        System.out.println("totalKcal = " + totalKcal);
        System.out.println("totalKjoule = " + totalKjoule);
        System.out.println("Gennemsnitlig Vægt: " + totalVægt / count);
        System.out.println("Gennemsnitlig kcal: " + totalKcal / count);
        System.out.println("Gennemsnitlig kjoule: " + totalKjoule / count);
        System.out.println();
    }
}