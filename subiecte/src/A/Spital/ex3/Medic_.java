package A.Spital.ex3;

public class Medic_  extends Personal_{
    public Medic_(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Medicul "+super.getNume()+" are vechimea de "+super.getVechime()+" ani.");

    }
}
