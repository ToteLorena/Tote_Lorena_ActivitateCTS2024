import sustinereExamen.classes.Student;
import sustinereExamen.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Pop Denis", "popdenis@stud.ase.ro",3);
        Student student2 = new Student(126, "Butacu Maria", "butacumaria@stud.ase.ro",3);
        Student student3 = new Student(526, "Popescu Ion", "popescuion@stud.ase.ro",3);
        Student student4 = new Student(673, "Popescu Diana", "popescudiana@stud.ase.ro",3);

        SustinereExamen poo = new SustinereExamen("Progrmare Orientata Obiect");
        SustinereExamen cts = new SustinereExamen("Calitate si Testare Software");

        poo.inregistrareStudent(student1);
        poo.inregistrareStudent(student2);
        poo.inregistrareStudent(student1);
        poo.inregistrareStudent(student3);
        poo.inregistrareStudent(student4);
        poo.inregistrareStudent(student2);


    }
}
