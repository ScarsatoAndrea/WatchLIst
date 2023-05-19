package ai.quarta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.LinkedList;

public class Libreria {
    private LinkedList<Film> film;
    private LinkedList<Film> watchlist;

    public Libreria(){
        this.film = new LinkedList<>();
        this.watchlist = new LinkedList<>();
    }

    public void tsvr(File test2) {
        //initializing a new ArrayList out of String[]'s
        int i = 0;

        try (BufferedReader TSVReader = new BufferedReader(new FileReader(test2))) {
            String line = null;

            while ((line = TSVReader.readLine()) != null) {
                film.add(new Film());
                Object[] lineItems = line.split("\t"); //splitting the line and adding its items in String[]
                //adding the splitted line array to the ArrayList
                film.get(i).setTconst(String.valueOf(lineItems[0]));
                film.get(i).setTitleType(String.valueOf(lineItems[1]));
                film.get(i).setPrimaryTitle(String.valueOf((lineItems[2])));
                film.get(i).setOriginalTitle(String.valueOf(lineItems[3]));
                film.get(i).setAdult(Boolean.getBoolean(String.valueOf(lineItems[4])));
                film.get(i).setStartYear(String.valueOf(lineItems[5]));
                film.get(i).setEndYear("");
                film.get(i).setRuntimeMinutes(Integer.getInteger(String.valueOf(lineItems[7])));
                film.get(i).setGenres(String.valueOf(lineItems[8]));
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String visualizzaWatchList(){
        String s = "";
        for (Film film : watchlist){
            s += film.getOriginalTitle();
            s += " ";
            s += film.getStartYear();
            s += " ";
            s += film.getRuntimeMinutes();
            s += " ";
            s += film.getGenres();
            s += "\n";
        }
        return s;
    }

    public Film cercaFilm (String titolo){
        int i = 0;
        while (titolo != film.get(0).getOriginalTitle()){
            i++;
        }
        return film.get(i);
    }

    public void aggiungiElementoWL (Film film){
        watchlist.add(film);
    }

}
