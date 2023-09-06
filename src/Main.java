public class Main {
    
    
    public static void main(String[] args) {
        Main app = new Main();
        app.start();

    }

    private void start() {
        Opskrift opskrift = getOpskrift();
        printStartBesked(opskrift);
        printIngrediensTabel(opskrift);
        printVægtEnergiTabel(opskrift);


    }

    private void printStartBesked(Opskrift opskrift) {
        System.out.printf("%s til %d personer: %n", opskrift.get);
    }

    private void printVægtEnergiTabel(Opskrift opskrift) {
        Ingrediens[] ingrediensList = opskrift.getIngrediensList();
        String formatString = "| %-10s | %-6.0f | %-6.0f | %-6.0f |%n";
        System.out.printf("| %-10s | %-6s | %-6s | %-6s | %n","Ingridiens","Vægt","Kcal","Kjoule");
        for(Ingrediens i : ingrediensList) {
            System.out.printf(formatString,i.getType(),i.beregnVægt(),i.beregnKcal(),i.beregnKjoule());
        }
        String breakLine = "-";
        System.out.println(breakLine.repeat(41));
        System.out.printf(formatString,"Total",opskrift.beregnTotalVægt(),opskrift.beregnTotalKcal(),opskrift.beregnTotalKjoule());
        System.out.println();
    }

    private void printIngrediensTabel(Opskrift opskrift) {
        Ingrediens[] ingrediensList = opskrift.getIngrediensList();
        String formatString = "| %-10s | %6.0f | %-12s |%n";
        System.out.printf("| %-10s | %-6s | %-12s | %n","Ingridiens","Mængde","Enhed");
        for(Ingrediens i : ingrediensList) {
            System.out.printf(formatString,i.getType(),i.getMængde(),i.getEnhed());
        }
        System.out.println();
    }

    private Opskrift getOpskrift() {
        Ingrediens ingrediens1 = new Ingrediens("Æg", 2, "Styk", 2, 108, 50);
        Ingrediens ingrediens2 = new Ingrediens("Mel", 400, "gram", 2, 1456);
        Ingrediens ingrediens3 = new Ingrediens("Vand", 500, "milliliter", 2, 0);
        Ingrediens ingrediens4 = new Ingrediens("Salt", 2, "tsk.", 2, 0, 10);

        Ingrediens[] ingrediensList = {ingrediens1, ingrediens2, ingrediens3, ingrediens4};

        return new Opskrift("Dej", ingrediensList);
    }
}