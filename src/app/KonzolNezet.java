package app;

public class KonzolNezet {

    private Filmek filmekModell;

    public KonzolNezet(Filmek filmekModell) {
        this.filmekModell = filmekModell;
        
    }

    private void megjelenit() {
        for (Film film : filmekModell.getFilmek()) {
            System.out.println(film);
        }
    }
    
    

}
