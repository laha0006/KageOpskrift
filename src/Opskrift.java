public class Opskrift {
    private String name;
    private Ingrediens[] ingrediensList;

    public Opskrift(String navn, Ingrediens[] ingrediensList) {
        this.name = navn;
        this.ingrediensList = ingrediensList;
    }

    public double beregnTotalVægt() {
        double totalVægt = 0;
        for (Ingrediens i : ingrediensList) {
            totalVægt += i.beregnVægt();
        }
        return totalVægt;
    }

    public double beregnTotalKcal() {
        double totalKcal = 0;
        for (Ingrediens i : ingrediensList) {
            totalKcal += i.beregnKcal();

        }
        return totalKcal;
    }

    public void setAntal(int antalPersoner) {
        for (Ingrediens i : ingrediensList) {
            i.setAntal(antalPersoner);
        }
    }


    // beregnTotalKjoule
    // gennemsnitVægt, Kcal, Kjoule
    // setAntal -- For loop og sæt antalPersoner
    public void printOpskrift() {
        for (Ingrediens ing : ingrediensList) {
            System.out.println(ing.beregnMængde() + " "
                    + ing.getEnhed()
                    + " " + ing.getType()
                    + " vægt: " + ing.beregnVægt()
                    + " kcal: " + ing.beregnKcal()
                    + " kjoule: " + ing.beregnKjoule());
        }
        System.out.println("Total Vægt: " + beregnTotalVægt());
    }
}

