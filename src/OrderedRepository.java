import java.util.*;

public class OrderedRepository<T> implements IRepository<T> {
    private List<T> orderedRepositories = new ArrayList<>();


    @Override
    public void save(T obj) {
        orderedRepositories.add(obj);
        System.out.println("Ordered repository: " + orderedRepositories);
    }

    @Override
    public void remove(T obj) {
        boolean foundMovie = false;
        for (int i = 0; i < orderedRepositories.size(); i++) {
            if (obj.equals(orderedRepositories.get(i))) {
                orderedRepositories.remove(i);
                System.out.println("Movie deleted");
                System.out.println("The new repository is: " + orderedRepositories);
                foundMovie = true;
                break;
            }
        }
        if (foundMovie == false) {
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
        Set<T> listedMovies = new TreeSet<>();
        for (int i = 0; i < orderedRepositories.size(); i++) {
            listedMovies.add(orderedRepositories.get(i));
        }
        System.out.println("The list of movies in OrderedRepository: ");
        Iterator membersOfOrderedRepository = listedMovies.iterator();
        while (membersOfOrderedRepository.hasNext()) {
            System.out.println(membersOfOrderedRepository.next());
        }
        return null;
    }
}
