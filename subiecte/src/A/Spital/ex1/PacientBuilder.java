package A.Spital.ex1;

public class PacientBuilder implements AbstractBuilder{

    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public PacientBuilder() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
        this.halatPentruInterior = false;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

    public boolean isPapuciDeCamera() {
        return papuciDeCamera;
    }

    public boolean isHalatPentruInterior() {
        return halatPentruInterior;
    }

    public PacientBuilder setPatRabatabil( ) {
        this.patRabatabil = !this.patRabatabil;
        return this;
    }

    public PacientBuilder setMicDejunInclus( ) {
        this.micDejunInclus = !this.micDejunInclus;
        return this;
    }

    public PacientBuilder setPapuciDeCamera( ) {
        this.papuciDeCamera = !this.papuciDeCamera;
        return this;
    }

    public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = !this.halatPentruInterior;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(patRabatabil, micDejunInclus, papuciDeCamera, halatPentruInterior);
    }
}
