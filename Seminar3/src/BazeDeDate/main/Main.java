package BazeDeDate.main;


import BazeDeDate.classes.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("Baza1", 20, "Link1");
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance("Baza2", 50, "Link2");

        conexiune1.setNumeBaza("NumeBazaNou");
        conexiune2.setNumeBaza("NumeNou2");

        System.out.println(conexiune1);
        System.out.println(conexiune2);
    }


}