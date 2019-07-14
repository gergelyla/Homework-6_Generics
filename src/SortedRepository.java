
import java.util.Set;
import java.util.TreeSet;

public class SortedRepository<T> implements IRepository<T>{
    private Set<T> sortedRepositories = new TreeSet<>();

    @Override
    public void save(T obj) {

    }

    @Override
    public void remove(T obj) {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Set<T> listAll() {
        return null;
    }

}
