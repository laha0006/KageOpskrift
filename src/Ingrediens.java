public class Ingrediens {
    private final double EN_KCAL_I_KJOULE = 4.184d;

    private final String type;
    private final double mængde;
    private final String enhed;
    private final int oprindeligAntal;
    private final double kcal;
    private final double vægtPrEnhed;
    private int antalPersoner;


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

    public double beregnVægt() {
        double mængde = beregnMængde();
        return mængde * vægtPrEnhed;
    }

    public double beregnKcal(int antalPersoner) {
        double faktor = (double) antalPersoner / oprindeligAntal;
        return faktor * kcal;

    }

    public double beregnKcal() {
        double faktor = (double) antalPersoner / oprindeligAntal;
        return faktor * kcal;
    }

    public double beregnKjoule() {
        double faktor = (double) antalPersoner / oprindeligAntal;
        return faktor * kcal * EN_KCAL_I_KJOULE;

    }

    public void setAntal(int antalPersoner) {
        this.antalPersoner = antalPersoner;
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
