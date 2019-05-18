
import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements Repository {

    private List<String> data = new ArrayList<>();

    @Override
    public List<String> getAll() {
        return data;
    }

    @Override
    public void add(String element) {
        data.add(element);
    }

    @Override
    public void update(int index, String element) {
        data.remove(index);
        data.add(index, element);
    }

    @Override
    public void remove(int index) {
        data.remove(index);
    }

    @Override
    public void remove(String element) {

        while (data.remove(element));


        }
    }
