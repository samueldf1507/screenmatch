package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int release_year;
    private boolean includedInPlan;
    private double sumAvaliations;
    private int totalAvaliations;
    private int movieTotalTime;

    public int getTotalAvaliations() {
        return totalAvaliations;
    }

    public String getName() {
        return name;
    }

    public int getRelease_year() {
        return release_year;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getMovieTotalTime() {
        return movieTotalTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setMovieTotalTime(int movieTotalTime) {
        this.movieTotalTime = movieTotalTime;
    }

    public void exhibeInformations() {
        System.out.printf("Nome do filme: %s", name);
        System.out.println();
        System.out.printf("Ano de lançamento: %d", release_year);
    }

    public void avaliate(double rate) {
        sumAvaliations += rate;
        totalAvaliations++;
    }

    public double avarageAvaliation() {
        return sumAvaliations / totalAvaliations;
    }
}
