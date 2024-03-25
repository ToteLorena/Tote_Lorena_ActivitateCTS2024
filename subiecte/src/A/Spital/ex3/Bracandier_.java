package A.Spital.ex3;

public class Bracandier_ extends Personal_{
    public Bracandier_(String nume, int vechime) {
        super(nume, vechime);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Bracandierul "+super.getNume()+" are vechimea de "+super.getVechime()+" ani.");
    }
}
