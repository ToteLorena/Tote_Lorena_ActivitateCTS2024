package A.Spital.ex3;

public class Asistent_ extends Personal_{
    public Asistent_(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Asistentul "+super.getNume()+" are vechimea de "+super.getVechime()+" ani.");

    }
}
