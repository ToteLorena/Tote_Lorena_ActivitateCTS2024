package A.Spital.ex3;

public class MedicFactory extends PersonalFactory_{

    public MedicFactory(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public Personal_ getPersonal() {
        return new Medic_(super.getNume(), super.getVechime());
    }
}
