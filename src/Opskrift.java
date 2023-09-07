import java.util.ArrayList;

public class Opskrift {
    private final String name;
    private final Ingrediens[] ingrediensList;
    private int antalPersoner;




    public Opskrift(String name, Ingrediens[] ingrediensList) {
        this.name = name;
        this.ingrediensList = ingrediensList;
        antalPersoner = ingrediensList[0].getOprindeligAntal();
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

    public int getAntalPersoner() {
        return antalPersoner;
    }

    public String getName() {
        return name;
    }

}

