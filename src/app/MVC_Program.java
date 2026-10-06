package app;

import Modell.Filmek;
import Modell.Film;
import Nezet.ExcelNezet;
import Nezet.KonzolNezet;

public class MVC_Program {

    public static void main(String[] args) {
        
        Filmek filmekModell = new Filmek();
        filmekModell.felvesz(new Film("Avatar", "James Cameron", 2009, 7.8, false));
        
        new ExcelNezet(filmekModell).excelMegjelenit();
    }
}
