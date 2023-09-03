public class Ingrediens {
    private String type;
    private double mængde;
    private String enhed;
    private int oprindeligAntal;
    private double kcal;
    private double vægtPrEnhed;
    private int antalPersoner;

    // comment to test git push.
    public Ingrediens(String type, double mængde, String enhed, int oprindeligAntal, double kcal) {
        this.type = type;
        this.mængde = mængde;
        this.enhed = enhed;
        this.oprindeligAntal = oprindeligAntal;
        this.kcal = kcal;
        antalPersoner = oprindeligAntal;
        vægtPrEnhed = 1;
    }

    public Ingrediens(String type, double mængde, String enhed, int oprindeligAntal, double kcal, double vægtPrEnhed) {
        this.type = type;
        this.mængde = mængde;
        this.enhed = enhed;
        this.oprindeligAntal = oprindeligAntal;
        this.kcal = kcal;
        this.vægtPrEnhed = vægtPrEnhed;
        antalPersoner = oprindeligAntal;
    }

    public double beregnMængde(int antalPersoner) {
        double faktor = (double) antalPersoner / oprindeligAntal;
        return mængde * faktor;
    }
    
    public double beregnMængde() {
        double faktor = (double) antalPersoner / oprindeligAntal;
        return mængde * faktor;
    }

    public double beregnVægt(int antalPersoner) {
        double mængde = beregnMængde(antalPersoner);
        return mængde * vægtPrEnhed;
    }

    public double beregnEnergi(int antalPersoner) {
        double faktor = (double) antalPersoner / oprindeligAntal;
        return faktor * kcal;
        // 200 g mel, kcal = 50, 2 personer
        // 4 -   4 / 2 = 2, 2 * 50
        // 400/200 = 2 * kcal 50
    }

    public String getType() {
        return type;
    }

    public double getMængde() {
        return mængde;
    }

    public String getEnhed() {
        return enhed;
    }

    public int getOprindeligAntal() {
        return oprindeligAntal;
    }

    public double getKcal() {
        return kcal;
    }

    public double getVægtPrEnhed() {
        return vægtPrEnhed;
    }
}
