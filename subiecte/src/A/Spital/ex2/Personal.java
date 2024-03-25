package A.Spital.ex2;

public abstract class Personal {
    private String nume;
    private int vechime;

    protected Personal(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }

    public String getNume() {
        return nume;
    }

    public int getVechime() {
        return vechime;
    }

    public abstract void afiseazaDetalii();
}
