package A.Spital.ex2;

public class Bracandier extends Personal{


    protected Bracandier(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Bracandierul "+super.getNume()+" are vechimea "+super.getVechime());
    }
}
