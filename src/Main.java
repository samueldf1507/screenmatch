import br.com.alura.screenmatch.calculator.RecomendationFilter;
import br.com.alura.screenmatch.calculator.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie thegodfather = new Movie("O poderoso chefão", 1970);
        thegodfather.setMovieTotalTime(180);
        System.out.println("Duração do filme: " + thegodfather.getMovieTotalTime() + "minutos");

        thegodfather.exhibeInformations();
        thegodfather.avaliate(8);
        thegodfather.avaliate(5);
        thegodfather.avaliate(10);
        System.out.println();

        System.out.println("Total de avaliações: " + thegodfather.getTotalAvaliations());
        System.out.println(thegodfather.avarageAvaliation());

        Series twoandahalfman = new Series("Two and a Half Man", 2003);
        System.out.println();
        twoandahalfman.setSeasons(12);
        twoandahalfman.exhibeInformations();
        twoandahalfman.setEpisodesForSeason(24);
        twoandahalfman.setTimeEpisode(20);
        System.out.println();
        System.out.println("Tempo para maratonar Rick and Morty: " + twoandahalfman.getMovieTotalTime() + " minutos");
        
        
        Movie avatar = new Movie("Avatar", 2023);
        System.out.println();
        avatar.setMovieTotalTime(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(thegodfather);
        calculator.includes(avatar);
        calculator.includes(twoandahalfman);

        System.out.println(calculator.getTotaltime());

        RecomendationFilter recomendationFilter = new RecomendationFilter();
        recomendationFilter.filter(thegodfather);

        Episode episode = new Episode();
        episode.setEpisodeNumber(1);
        episode.setSeries(twoandahalfman);
        episode.setTotalVizualizations(300);
        recomendationFilter.filter(episode);

        var pauloMovie = new Movie("Dogville", 2003);

        pauloMovie.setMovieTotalTime(200);
        pauloMovie.avaliate(10);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(avatar);
        movies.add(thegodfather);
        movies.add(pauloMovie);

        System.out.println("Número de filmes na lista: " + movies.size());
        System.out.println("Primeiro filme da lista: " + movies.get(0).toString());
        System.out.println(movies);

        

    }
}
