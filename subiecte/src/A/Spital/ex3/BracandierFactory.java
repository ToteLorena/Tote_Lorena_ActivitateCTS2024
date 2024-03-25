package A.Spital.ex3;

public class BracandierFactory extends PersonalFactory_{
    public BracandierFactory(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public Personal_ getPersonal() {
        return new Bracandier_(super.getNume(),super.getVechime());
    }
}
