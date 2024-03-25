package A.Spital.ex3;

public class AsistentFactory extends PersonalFactory_{
    public AsistentFactory(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public Personal_ getPersonal() {
        return new Asistent_(super.getNume(), super.getVechime());
    }
}
