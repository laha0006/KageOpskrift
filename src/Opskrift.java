public class Opskrift {
    private final String name;
    private final Ingrediens[] ingrediensList;
    private int antalPersoner;



    public Opskrift(String name, Ingrediens[] ingrediensList) {
        this.name = name;
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
    public double beregnTotalKjoule() {
        double totalKjoule = 0;
        for (Ingrediens i : ingrediensList) {
            totalKjoule += i.beregnKjoule();
        }
        return totalKjoule;
    }

    public double gennemsnitVægt(){
        return beregnTotalVægt() / ingrediensList.length;
    }
    public double gennemsnitKcal(){
        return beregnTotalKcal() / ingrediensList.length;
    }
    public double gennemsnitKjoule(){
        return beregnTotalKjoule() / ingrediensList.length;
    }

    public Ingrediens[] getIngrediensList() {
        return ingrediensList;
    }


    public void setAntal(int antalPersoner) {
        this.antalPersoner = antalPersoner; // bliver ikke brugt endnu, til fremtidig brug af udregning af gennemsnit per person.
        for (Ingrediens i : ingrediensList) {
            i.setAntal(antalPersoner);
        }
    }



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
        System.out.println("Total Kcal: " + beregnTotalKcal());
        System.out.println("Total Kjoule: " + beregnTotalKjoule());
        System.out.println("Gennemsnits Vægt: " + gennemsnitVægt());
        System.out.println("Gennemsnits Kcal: " + gennemsnitKcal());
        System.out.println("Gennemsnits Kjoule: " + gennemsnitKjoule());

    }
}

