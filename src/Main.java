import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int ANTAL_PERSONER = 2;
        System.out.println("KAAAAAGGGEEEEEEEE!");
        Ingrediens ingrediens1 = new Ingrediens("Æg", 2, "Styk", ANTAL_PERSONER, 108, 50);
        Ingrediens ingrediens2 = new Ingrediens("Mel", 400, "gram", ANTAL_PERSONER, 1456);
        Ingrediens ingrediens3 = new Ingrediens("Vand", 500, "milliliter", ANTAL_PERSONER, 0);
        Ingrediens ingrediens4 = new Ingrediens("Salt", 2, "tsk.", ANTAL_PERSONER, 0, 10);

        ArrayList<Ingrediens> ingrediensList = new ArrayList<>();
        Ingrediens[] ingrediensList2 = new Ingrediens[4];
        ingrediensList2[0] = ingrediens1;
        Ingrediens[] ingrediensList3 = {ingrediens1, ingrediens2, ingrediens3,ingrediens4};

        ingrediensList.add(ingrediens1);
        ingrediensList.add(ingrediens2);
        ingrediensList.add(ingrediens3);
        ingrediensList.add(ingrediens4);
        // ingrediensList = {ingrediens1, ingrediens2,....}
        Ingrediens[] ingrediensList = {ingrediens1,}

        for (Ingrediens ingrediens : ingrediensList3) {

        }

        double totalVægt = 0;
        double totalKcal = 0;
        double totalKjoule = 0;
        int count = ingrediensList.length;
        for (Ingrediens ing : ingrediensList) {
            System.out.println(ing.beregnMængde() + " "
                    + ing.getEnhed()
                    + " " + ing.getType()
                    + " vægt: " + ing.beregnVægt()
                    + " kcal: " + ing.beregnKcal()
                    + " kjoule: " + ing.beregnKjoule());
            totalVægt += ing.beregnVægt(); // totalVægt = totalVægt + ing.beregnVægt()
            totalKcal += ing.beregnKcal();
            totalKjoule += ing.beregnKjoule();
        }
        System.out.println();
        System.out.println("totalVægt = " + totalVægt);
        System.out.println("totalKcal = " + totalKcal);
        System.out.println("totalKjoule = " + totalKjoule);
        System.out.println("Gennemsnitlig Vægt: "+ totalVægt / count);
        System.out.println("Gennemsnitlig kcal: " +totalKcal / count);
        System.out.println("Gennemsnitlig kjoule: "+ totalKjoule / count);
        System.out.println();
        for (Ingrediens ing : ingrediensList) {
            ing.setAntal(4);
            System.out.println(ing.beregnMængde() + " "
                    + ing.getEnhed()
                    + " " + ing.getType()
                    + " kcal: " + ing.beregnKcal()
                    + " kjoule: " + ing.beregnKjoule());
        }
    }
}