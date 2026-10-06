package Nezet;

import Modell.Filmek;
import Modell.Film;
import java.io.FileWriter;
import java.io.IOException;

public class ExcelNezet {

    private Filmek filmekModell;

    public ExcelNezet(Filmek filmekModell) {
        this.filmekModell = filmekModell;
    }
    
    public void excelMegjelenit() {
        try {
            FileWriter iro = new FileWriter("excel.csv");
            String[] s = {"Cím", "Rendezõ", "Megjelenési év", "Pont", "Korhatáros"};
            for (int i = 0; i < s.length; i++) {
                if (i < 4) {
                    iro.write(s[i] + ";");
                } else if (i == 4) {
                    iro.write(s[i] + ";" + "\n");

                }

            }
            for (Film film : filmekModell.getFilmek()) {
                iro.write(film.getCim() + ";");
                iro.write(film.getRendezo() + ";");
                iro.write(film.getMegjelenesiEv() + ";");
                iro.write(film.getPont() + ";");
                iro.write(film.isKorhataros() ? "igaz" + ";\n" : "hamis" + ";\n");
            }
            iro.close();
            System.out.println("A fájl sikeresen elkészült!");
        } catch (IOException e) {
            System.out.println("Hiba történt a fájl írásakor.");
        }
    }
}
