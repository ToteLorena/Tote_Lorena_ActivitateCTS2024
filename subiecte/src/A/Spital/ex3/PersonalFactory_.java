package A.Spital.ex3;

public abstract class PersonalFactory_ {
    private String nume;
    private int vechime;

    public PersonalFactory_(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }

    public String getNume() {
        return nume;
    }

    public int getVechime() {
        return vechime;
    }

    public abstract Personal_ getPersonal();
}
