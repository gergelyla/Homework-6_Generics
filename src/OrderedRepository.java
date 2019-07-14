import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OrderedRepository<T> implements IRepository<T> {
    private List<T> orderedRepositories = new ArrayList<>();


    @Override
    public void save(T obj) {
        orderedRepositories.add(obj);
        System.out.println("Ordered repository: " + orderedRepositories);
    }

    @Override
    public void remove(T obj) {
        boolean foundMovie;
        for (int i = 0; i < orderedRepositories.size(); i++) {
            if (obj.equals(orderedRepositories.get(i))) {
                orderedRepositories.remove(i);
                System.out.println("Movie deleted");
                System.out.println("The new repository is: " + orderedRepositories);
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
        for (T t : orderedRepositories) {
            movieCounter++;
        }
        return movieCounter;
    }

    @Override
    public Set<T> listAll() {
        return null;
    }
}
