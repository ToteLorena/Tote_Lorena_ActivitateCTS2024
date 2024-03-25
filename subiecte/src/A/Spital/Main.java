package A.Spital;

import A.Spital.ex1.Pacient;
import A.Spital.ex1.PacientBuilder;
import A.Spital.ex2.Personal;
import A.Spital.ex2.PersonalSimpleFactory;
import A.Spital.ex2.TipPersonal;
import A.Spital.ex3.BracandierFactory;
import A.Spital.ex3.MedicFactory;
import A.Spital.ex3.PersonalFactory_;
import A.Spital.ex3.Personal_;
import A.Spital.ex4.AbstractPrototype;
import A.Spital.ex4.Reteta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------EX 1--------------------------\n");
        PacientBuilder pacientBuilder = new PacientBuilder().setMicDejunInclus().setPapuciDeCamera();
        Pacient pacient = pacientBuilder.build();
        System.out.println(pacient);


        System.out.println("\n--------------------------EX 2--------------------------\n");
        Personal personal = PersonalSimpleFactory.getPersonal(TipPersonal.Asistent, "Ana", 6);
        personal.afiseazaDetalii();
        Personal personal1 = PersonalSimpleFactory.getPersonal(TipPersonal.Medic, "Maria", 4);
        personal1.afiseazaDetalii();


        System.out.println("\n--------------------------EX 3--------------------------\n");
        PersonalFactory_ personalFactory = new BracandierFactory("Ana", 7);
        Personal_ personal_ = personalFactory.getPersonal();
        personal_.afiseazaDetalii();

        PersonalFactory_ personalFactory1 = new MedicFactory("Andrei", 3);
        Personal_ personal_1=personalFactory1.getPersonal();
        personal_1.afiseazaDetalii();

        System.out.println("\n--------------------------EX 4--------------------------\n");
        List<String> ingrediente = new ArrayList<>();
        ingrediente.add("i1");
        ingrediente.add("i2");
        Map<String, Integer> cantitati = new HashMap<>();
        cantitati.put("i1", 40);
        cantitati.put("i2", 30);
        Reteta reteta = new Reteta(ingrediente, cantitati);
        AbstractPrototype reteta2 = reteta.copiaza();
        System.out.println(reteta);
        System.out.println(reteta2);


    }
}