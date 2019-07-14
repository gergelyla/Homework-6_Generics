import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Films movie1=new Films("Indiana Jones", 120);
        Films movie2=new Films("Star Wars -A New Hope", 130);
        Films movie3=new Films("Back to the Future", 110);

        //SortedRepository methods
        SortedRepository<Films> sortedRepository= new SortedRepository<>();

        sortedRepository.save(movie1);
        sortedRepository.save(movie2);
        sortedRepository.save(movie3);

        System.out.println("----------------------------------------------------------");






        //OrderedRepository methods
        OrderedRepository<Films> orderedRepository=new OrderedRepository<>();

        orderedRepository.save(movie1);
        orderedRepository.save(movie2);
        orderedRepository.save(movie3);

        System.out.println("----------------------------------------------------------");


    }
}
