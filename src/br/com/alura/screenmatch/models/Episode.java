package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculator.Classificable;

public class Episode implements Classificable {
    private String episodeName;
    private int episodeNumber;
    private Series series;
    private int totalVizualizations;

    public int getTotalVizualizations() {
        return totalVizualizations;
    }

    public void setTotalVizualizations(int totalVizualizations) {
        this.totalVizualizations = totalVizualizations;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if (totalVizualizations > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
