package proxy.clase;

public class Autobuz implements Opritor {
    private int nrCalatori;
    private int nrAutobuz;
    private String numeSofer;

    public Autobuz(int nrCalatori, int nrAutobuz, String numeSofer) {
        this.nrCalatori = nrCalatori;
        this.nrAutobuz = nrAutobuz;
        this.numeSofer = numeSofer;
    }

    @Override
    public void opresteInStatie(String statie) {
        System.out.printf("Autobuzul %d condus de %s a oprit in statia %s.%n", nrAutobuz, nrCalatori, statie);
    }

    @Override
    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public int getNrAutobuz() {
        return nrAutobuz;
    }
}
