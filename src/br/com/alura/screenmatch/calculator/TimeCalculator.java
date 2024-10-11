package br.com.alura.screenmatch.calculator;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totaltime;

    public int getTotaltime() {
        return totaltime;
    }

//    public void includes(Movie m) {
//        totaltime += m.getMovieTotalTime();
//    }
//
//    public void includes(Series s) {
//        totaltime += s.getMovieTotalTime();
//    }

    public void includes(Title title) {
        totaltime += title.getMovieTotalTime();
    }
}
