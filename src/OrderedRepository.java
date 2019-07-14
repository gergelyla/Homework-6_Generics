import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OrderedRepository<T> implements IRepository<T>{
    private List<T> orderedRepositories = new ArrayList<>();


    @Override
    public void save(T obj) {
        orderedRepositories.add(obj);
        System.out.println("Ordered repository: "+orderedRepositories);
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
