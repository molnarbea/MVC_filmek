package Nezet;

import Modell.Film;
import Modell.Filmek;

public class TablazatosNezet {

    private Filmek filmekModell;

    public TablazatosNezet(Filmek filmekModell) {
        this.filmekModell = filmekModell;
    }
    
    public void tablazatosMegjelenites(){
        String s = "|%-20s |%-20s |%-10s |%-5s %-5s%n";
        System.out.printf(s,"Cím", "Rendezõ", "Megjelenési év", "Pont", "Korhatáros");
        for (Film film : filmekModell.getFilmek()) {
            System.out.printf("|%-20s |%-20s |%-10d |%-5.1f %-5s%n",
                    film.getCim(),
                    film.getRendezo(),
                    film.getMegjelenesiEv(),
                    film.getPont(),
                    film.isKorhataros()
            );
        }
    }
}
