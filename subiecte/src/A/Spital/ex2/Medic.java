package A.Spital.ex2;

public class Medic extends Personal{
    protected Medic(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Medicul "+super.getNume()+" are vechimea "+super.getVechime());
    }
}
