import br.com.alura.screenmatch.calculator.TimeCalculator;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

public class Main {
    public static void main(String[] args) {
        Movie thegodfather = new Movie();
        thegodfather.setName("O poderoso chefão");
        thegodfather.setRelease_year(1970);
        thegodfather.setMovieTotalTime(180);
        System.out.println("Duração do filme: " + thegodfather.getMovieTotalTime() + "minutos");

        thegodfather.exhibeInformations();
        thegodfather.avaliate(8);
        thegodfather.avaliate(5);
        thegodfather.avaliate(10);
        System.out.println();

        System.out.println("Total de avaliações: " + thegodfather.getTotalAvaliations());
        System.out.println(thegodfather.avarageAvaliation());

        Series twoandahalfman = new Series();
        System.out.println();
        twoandahalfman.setName("Two and a Half Man");
        twoandahalfman.setSeasons(12);
        twoandahalfman.setRelease_year(2003);
        twoandahalfman.exhibeInformations();
        twoandahalfman.setEpisodesForSeason(24);
        twoandahalfman.setTimeEpisode(20);
        System.out.println();
        System.out.println("Tempo para maratonar Rick and Morty: " + twoandahalfman.getMovieTotalTime() + " minutos");
        
        
        Movie avatar = new Movie();
        System.out.println();
        avatar.setMovieTotalTime(200);
        
        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(thegodfather);
        calculator.includes(avatar);
        calculator.includes(twoandahalfman);

        System.out.println(calculator.getTotaltime());
    }
}
