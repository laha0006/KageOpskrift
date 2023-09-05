public class Opskrift {
    private final String name;
    private final Ingrediens[] ingrediensList;
    private int antalPersoner;


    //Opskrift konstruktør, med 2 parametre, name, og en liste af ingredienser
    //dvs. når man instansiere et opskrift objekt, skal man give de 2 argumenter
    //et navn, og en liste af ingredienser.
    public Opskrift(String name, Ingrediens[] ingrediensList) {
        this.name = name;
        this.ingrediensList = ingrediensList;
    }

    //metoden bruger objektets liste af ingredienser
    //som er sat når man har instansieret et nyt opskrift objekt.
    //metoden bruger en for each loop til at gå gennem hver ingrediens
    //i listen og ligge det til det lokale variable totalVægt
    //når loopen er færdig retuneres det lokale variable totalVægt.
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

    //metoend kalder BeregnTotalVægt() for at få den totale vægt
    //så man ikke behøver at lave den samme kode/udregning igen.
    //derefter bliver det divideret med ingredienslistens længde.
    //resultatet af udregningen bliver retuneret.
    public double gennemsnitVægt(){
        return beregnTotalVægt() / ingrediensList.length;
    }
    public double gennemsnitKcal(){
        return beregnTotalKcal() / ingrediensList.length;
    }
    public double gennemsnitKjoule(){
        return beregnTotalKjoule() / ingrediensList.length;
    }

    //dette er en set metode, til at sætte antallet af personer
    //som opskriften skal beregne ud fra.
    //den looper igennem ingrediens listen og sætter hver ingrediens
    //til antalPersoner argumentets værdi
    public void setAntal(int antalPersoner) {
        this.antalPersoner = antalPersoner; // bliver ikke brugt endnu, til fremtidig brug af udregning af gennemsnit per person.
        for (Ingrediens i : ingrediensList) {
            i.setAntal(antalPersoner);
        }
    }

    //print metoden looper igen igennem hver ingrediens
    //og printer data ud
    //til sidst kalder vi opskrifts metoder til at vise totaler, og gennemsnit.
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

