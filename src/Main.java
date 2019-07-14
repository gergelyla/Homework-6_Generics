import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        SortedRepository movie1=new SortedRepository("Indiana Jones",120);
        SortedRepository movie2=new SortedRepository("Star Wars",130);
        SortedRepository movie3=new SortedRepository("Anaconda",110);

        List<SortedRepository> listOfMovies=new ArrayList<>();
        listOfMovies.add(movie1);
        listOfMovies.add(movie2);
        listOfMovies.add(movie3);

        System.out.println(listOfMovies);
    }
}
