package sustinereExamen.classes;

import java.util.HashMap;

public class SustinereExamen {
    private String nume;
    HashMap<Integer, Student> listaStudenti = new HashMap<>();

    public SustinereExamen(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public HashMap<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void inregistrareStudent(Student student) {
        if(listaStudenti.containsKey(student.getId())){
            System.out.println("Studentul " + student.getName() + " a sustinut deja examenul.");
        } else {
            listaStudenti.put(student.getId(), student);
            System.out.println("Studentul " + student.getName() + " sustine acum examenul.");

        }
    }
}
