package Nezet;

import Modell.Filmek;
import Modell.Film;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLFajlNezet {

    private Filmek filmekModell;

    public HTMLFajlNezet(Filmek filmekModell) {
        this.filmekModell = filmekModell;
    }
    
    public void HTMLFajlegjelenit() {
        try {
            FileWriter iro = new FileWriter("index.html");
            iro.write("<head>"
                    + "<style>\n"
                    + "  table {\n"
                    + "    width: 100%;\n"
                    + "    border-collapse: collapse;\n"
                    + "    margin: 20px 0;\n"
                    + "    font-family: sans-serif;\n"
                    + "    min-width: 400px;\n"
                    + "    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);\n"
                    + "    border-radius: 5px 5px 0 0;\n"
                    + "    overflow: hidden;\n"
                    + "  }\n"
                    + "\n"
                    + "  th {\n"
                    + "    background-color: #009879;\n"
                    + "    color: #ffffff;\n"
                    + "    text-align: left;\n"
                    + "    font-weight: bold;\n"
                    + "    padding: 12px 15px;\n"
                    + "  }\n"
                    + "\n"
                    + "  td {\n"
                    + "    padding: 12px 15px;\n"
                    + "    color: #333333;\n"
                    + "    border-bottom: 1px solid #dddddd;\n"
                    + "  }\n"
                    + "\n"
                    + "  /* Minden második sor háttere világosszürke (zebra csíkozás) */\n"
                    + "  tr:nth-of-type(even) {\n"
                    + "    background-color: #f3f3f3;\n"
                    + "  }\n"
                    + "\n"
                    + "  /* Az utolsó sor aljának kiemelése */\n"
                    + "  tr:last-of-type {\n"
                    + "    border-bottom: 2px solid #009879;\n"
                    + "  }\n"
                    + "\n"
                    + "  /* Sor kijelölése egérrel való ráközelítéskor (Hover effekt) */\n"
                    + "  tr:hover {\n"
                    + "    background-color: #f1f1f1;\n"
                    + "    cursor: pointer;\n"
                    + "  }\n"
                    + "</style></head>");
            iro.write("<html><body>");
            iro.write("<table border=\"8\">");
            iro.write("<tr>"
                    + "<th>Cím</th>\n"
                    + "<th>Rendezõ</th>\n"
                    + "<th>Kiadásév</th>\n"
                    + "<th>Pont</th>\n"
                    + "<th>Korhatáros</th>\n"
                    + "</tr>");
            for (Film film : filmekModell.getFilmek()) {
                iro.write("<tr>");
                iro.write("<td>" + film.getCim() + "</td>");
                iro.write("<td>" + film.getRendezo() + "</td>");
                iro.write("<td>" + film.getMegjelenesiEv() + "</td>");
                iro.write("<td>" + film.getPont() + "</td>");
                iro.write("<td>" + (film.isKorhataros()? "igaz" : "hamis") + "</td>");
                iro.write("</tr>");
            }
            iro.write("</table>");
            iro.write("</body></html>");
            iro.close();

            System.out.println("A fájl sikeresen elkészült!");

        } catch (IOException e) {
            System.out.println("Hiba történt a fájl írásakor.");
        }
    }

}
