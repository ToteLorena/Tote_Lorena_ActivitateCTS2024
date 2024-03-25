package A.Spital.ex2;

public class PersonalSimpleFactory {
    public static Personal getPersonal(TipPersonal tip, String nume, int vechime){
        switch (tip){
            case Brancardier:
                return new Bracandier(nume, vechime);
            case Asistent:
                return new Asistent(nume, vechime);
            case Medic:
                return new Medic(nume,vechime);
            default:
                try {
                    throw new Exception("Nu exista tipul!");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
