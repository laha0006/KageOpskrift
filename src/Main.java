import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int ANTAL_PERSONER = 2;
        System.out.println("Hello world!");
        Ingrediens ingrediens1 = new Ingrediens("Æg", 2, "Styk", ANTAL_PERSONER, 108, 50);
        Ingrediens ingrediens2 = new Ingrediens("Mel", 400, "gram", ANTAL_PERSONER, 1456);
        Ingrediens ingrediens3 = new Ingrediens("Vand", 500, "milliliter", ANTAL_PERSONER, 0);
        Ingrediens ingrediens4 = new Ingrediens("Salt", 2, "tsk.", ANTAL_PERSONER, 0, 10);

        ArrayList<Ingrediens> ingrediensList = new ArrayList<>();
        ingrediensList.add(ingrediens1);
        ingrediensList.add(ingrediens2);
        ingrediensList.add(ingrediens3);
        ingrediensList.add(ingrediens4);

        for (Ingrediens ing : ingrediensList) {
            System.out.println(ing.beregnMængde() + " "
                    + ing.getEnhed()
                    + " " + ing.getType());
        }
        for (Ingrediens ing : ingrediensList) {
            ing.setAntal(4);
            System.out.println(ing.beregnMængde() + " "
                    + ing.getEnhed()
                    + " " + ing.getType());
        }
    }
}