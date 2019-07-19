import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Films movie1 = new Films("Indiana Jones", 120);
        Films movie2 = new Films("Star Wars-A New Hope", 130);
        Films movie3 = new Films("Back to the Future", 110);

        //SortedRepository methods
        System.out.println("Sorted Repository methods:");
        System.out.println(" ");
        SortedRepository<Films> sortedRepository = new SortedRepository<>();

        saveSortedRepository(movie1, movie2, movie3, sortedRepository);
        removeSortedRepository(movie1, sortedRepository);
        countMembersOfSortedRepository(sortedRepository);
        listAllInSortedRepository(sortedRepository);
        System.out.println(" ");

        //OrderedRepository methods
        System.out.println("Ordered Repository methods:");
        System.out.println(" ");
        OrderedRepository<Films> orderedRepository = new OrderedRepository<>();

        saveOrderedRepository(movie1, movie2, movie3, orderedRepository);
        removeOrderedRepository(movie1, orderedRepository);
        countMembersOfOrderedRepository(orderedRepository);
        listAllInOrderedRepository(orderedRepository);
        System.out.println(" ");
    }

    private static void listAllInOrderedRepository(OrderedRepository<Films> orderedRepository) {
        System.out.println("List all movies in ordered repository: ");
        orderedRepository.listAll();
        System.out.println("----------------------------------------------------------");
    }

    private static void listAllInSortedRepository(SortedRepository<Films> sortedRepository) {
        System.out.println("List all movies in sorted repository: ");
        sortedRepository.listAll();
        System.out.println("----------------------------------------------------------");
    }

    private static void countMembersOfOrderedRepository(OrderedRepository<Films> orderedRepository) {
        System.out.println("Count movies in ordered repository: ");
        System.out.println("The ordered repository holds " + orderedRepository.count() + " movies.");
        System.out.println("----------------------------------------------------------");
    }

    private static void removeOrderedRepository(Films movie1, OrderedRepository<Films> orderedRepository) {
        System.out.println("Remove movies in ordered repository: ");
        orderedRepository.remove(movie1);
        /*orderedRepository.remove(movie2);
        orderedRepository.remove(movie3);*/
        System.out.println("----------------------------------------------------------");
    }

    private static void saveOrderedRepository(Films movie1, Films movie2, Films movie3, OrderedRepository<Films> orderedRepository) {
        System.out.println("Save movies in ordered repository: ");
        orderedRepository.save(movie1);
        orderedRepository.save(movie2);
        orderedRepository.save(movie3);
        System.out.println("----------------------------------------------------------");
    }

    private static void countMembersOfSortedRepository(SortedRepository<Films> sortedRepository) {
        System.out.println("Count movies in sorted repository: ");
        System.out.println("The sorted repository holds " + sortedRepository.count() + " movies.");
        System.out.println("----------------------------------------------------------");
    }

    private static void removeSortedRepository(Films movie1, SortedRepository<Films> sortedRepository) {
        System.out.println("Remove movies in sorted repository: ");
        sortedRepository.remove(movie1);
        /*sortedRepository.remove(movie2);
        sortedRepository.remove(movie3);*/
        System.out.println("----------------------------------------------------------");
    }

    private static void saveSortedRepository(Films movie1, Films movie2, Films movie3, SortedRepository<Films> sortedRepository) {
        System.out.println("Save movies in sorted repository: ");
        sortedRepository.save(movie1);
        sortedRepository.save(movie2);
        sortedRepository.save(movie3);
        System.out.println("----------------------------------------------------------");
    }
}
