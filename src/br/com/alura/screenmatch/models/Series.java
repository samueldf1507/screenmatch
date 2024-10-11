package br.com.alura.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodesForSeason;
    private int timeEpisode;
    private boolean activeSerie;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesForSeason() {
        return episodesForSeason;
    }

    public void setEpisodesForSeason(int episodesForSeason) {
        this.episodesForSeason = episodesForSeason;
    }

    public int getTimeEpisode() {
        return timeEpisode;
    }

    public void setTimeEpisode(int timeEpisode) {
        this.timeEpisode = timeEpisode;
    }

    public boolean isActiveSerie() {
        return activeSerie;
    }

    public void setActiveSerie(boolean activeSerie) {
        this.activeSerie = activeSerie;
    }

    @Override
    public int getMovieTotalTime() {
        return episodesForSeason * timeEpisode * seasons;
    }
}
