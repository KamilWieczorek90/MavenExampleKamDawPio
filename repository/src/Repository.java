import java.util.List;

public interface Repository {

    List<String> getAll();
    void add(String element);
    void update(int index, String element);
    void remove(int index);
    void remove(String element);

}
