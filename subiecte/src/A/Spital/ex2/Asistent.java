package A.Spital.ex2;

public class Asistent extends Personal{

    protected Asistent(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Asistentul "+super.getNume()+" are vechimea "+super.getVechime());

    }
}
