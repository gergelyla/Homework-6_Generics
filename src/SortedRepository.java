
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortedRepository<T> implements IRepository<T> {
    private Set<T> sortedRepositories = new TreeSet<>();

    @Override
    public void save(T obj) {
        sortedRepositories.add(obj);
        System.out.println("Sorted repository: " + sortedRepositories);
    }

    @Override
    public void remove(T obj) {
        boolean foundMovie;
        for (T t : sortedRepositories) {
            if (obj.equals(t)) {
                sortedRepositories.remove(t);
                System.out.println("Movie deleted");
                System.out.println("The new repository is: " + sortedRepositories);
                foundMovie = true;
                break;
            }
        }
        if (foundMovie = false) {
            System.out.println("No such movie in the repository");
        }
    }

    @Override
    public int count() {
        int movieCounter = 0;
        for (T t : sortedRepositories) {
            movieCounter++;
        }
        return movieCounter;
    }

    @Override
    public Set<T> listAll() {
        System.out.println("The list of movies in SortedRepository: ");
        Iterator membersOfSortedRepository = sortedRepositories.iterator();
        while (membersOfSortedRepository.hasNext()) {
            System.out.println(membersOfSortedRepository.next());
        }
        return null;
    }

}
