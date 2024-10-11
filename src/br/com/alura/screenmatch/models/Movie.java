package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculator.Classificable;

public class Movie extends Title implements Classificable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return 0;
    }
}
