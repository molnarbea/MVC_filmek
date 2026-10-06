package Nezet;

import Modell.Film;
import Modell.Filmek;

public class KonzolNezet {

    private Filmek filmekModell;

    public KonzolNezet(Filmek filmekModell) {
        this.filmekModell = filmekModell;
        
    }

    public void megjelenit() {
        for (Film film : filmekModell.getFilmek()) {
            System.out.println(film);
        }
    }
    
    

}
