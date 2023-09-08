public class Main {
    private final String TOP_LINE = "─";
    //testing git..
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        Opskrift opskrift = getOpskrift();
        opskrift.setAntal(50);
        printStartBesked(opskrift);
        printIngrediensTabel(opskrift);
        printVægtEnergiTabel(opskrift);
    }

    private void printStartBesked(Opskrift opskrift) {
        System.out.printf("%s til %d personer: %n", opskrift.getName(),opskrift.getAntalPersoner());
    }

    private void printVægtEnergiTabel(Opskrift opskrift) {
        Ingrediens[] ingrediensList = opskrift.getIngrediensList();
        System.out.print("\u250C" +TOP_LINE.repeat(12)+"\u252c"+TOP_LINE.repeat(8)+"\u252c"+TOP_LINE.repeat(8)+"\u252c"+TOP_LINE.repeat(8) +"\u2510\n");
        String formatString = "│ %-10s \u2502 %6.0f \u2502 %6.0f \u2502 %6.0f │%n";
        System.out.printf("\u2502 %-10s \u2502 %-6s \u2502 %-6s \u2502 %-6s \u2502%n","Ingridiens","Vægt","Kcal","Kjoule");
        System.out.print("\u251C" +TOP_LINE.repeat(12)+"\u253c"+TOP_LINE.repeat(8)+"\u253c"+TOP_LINE.repeat(8)+"\u253c"+TOP_LINE.repeat(8) +"\u2524\n");

        for(Ingrediens i : ingrediensList) {
            System.out.printf(formatString,i.getType(),i.beregnVægt(),i.beregnKcal(),i.beregnKjoule());
        }
        String breakLine = "-";
        System.out.print("\u251C" +TOP_LINE.repeat(12)+"\u253c"+TOP_LINE.repeat(8)+"\u253c"+TOP_LINE.repeat(8)+"\u253c"+TOP_LINE.repeat(8) +"\u2524\n");
        System.out.printf(formatString,"Total",opskrift.beregnTotalVægt(),opskrift.beregnTotalKcal(),opskrift.beregnTotalKjoule());
        System.out.print("\u251C" +TOP_LINE.repeat(12)+"\u253c"+TOP_LINE.repeat(8)+"\u253c"+TOP_LINE.repeat(8)+"\u253c"+TOP_LINE.repeat(8) +"\u2524\n");

        System.out.printf(formatString,"Gennemsnit",opskrift.gennemsnitVægt(),opskrift.gennemsnitKcal(),opskrift.gennemsnitKjoule());

        System.out.print("\u2514" +TOP_LINE.repeat(12)+"\u2534"+TOP_LINE.repeat(8)+"\u2534"+TOP_LINE.repeat(8)+"\u2534"+TOP_LINE.repeat(8) +"\u2518\n");

    }

    private void printIngrediensTabel(Opskrift opskrift) {
        Ingrediens[] ingrediensList = opskrift.getIngrediensList();
        System.out.print("\u250C" +TOP_LINE.repeat(12)+"\u252c"+TOP_LINE.repeat(8)+"\u252c"+TOP_LINE.repeat(14)+"\u2510\n");
        String formatString = "\u2502 %-10s \u2502 %6.0f \u2502 %-12s │%n";
        System.out.printf("\u2502 %-10s \u2502 %-6s \u2502 %-12s \u2502 %n","Ingridiens","Mængde","Enhed");
        System.out.print("\u251C" +TOP_LINE.repeat(12)+"\u253c"+TOP_LINE.repeat(8)+"\u253c"+TOP_LINE.repeat(14)+"\u2524\n");

        for(Ingrediens i : ingrediensList) {
            System.out.printf(formatString,i.getType(),i.getMængde(),i.getEnhed());
        }
        System.out.print("\u2514" +TOP_LINE.repeat(12)+"\u2534"+TOP_LINE.repeat(8)+"\u2534"+TOP_LINE.repeat(14)+"\u2518\n");

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