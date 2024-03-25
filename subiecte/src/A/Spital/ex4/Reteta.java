package A.Spital.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reteta implements AbstractPrototype{

    private List<String>ingrediente;
    private Map<String,Integer> cantitati;

    private Reteta() {
    }

    public Reteta(List<String> ingrediente, Map<String, Integer> cantitati) {
        this.ingrediente = ingrediente;
        this.cantitati = cantitati;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("ingrediente=").append(ingrediente);
        sb.append(", cantitati=").append(cantitati);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta reteta= new Reteta();
        reteta.ingrediente= new ArrayList<>();
        reteta.ingrediente.addAll(this.ingrediente);
        reteta.cantitati= new HashMap<>();
        reteta.cantitati.putAll(this.cantitati);
        return  reteta;
    }
}
