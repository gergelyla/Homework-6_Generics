import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Films movie1=new Films("Indiana Jones", 120);
        Films movie2=new Films("Star Wars -A New Hope", 130);
        Films movie3=new Films("Back to the Future", 110);

        //SortedRepository methods
        SortedRepository<Films> sortedRepository= new SortedRepository<>();






        //OrderedRepository methods
        OrderedRepository<Films> orderedRepository=new OrderedRepository<>();


    }
}
