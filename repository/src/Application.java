
public class Application {

    public static void main(String[] args) {
        Repository repo1 = new InMemoryRepository();
        Repository repo2 = new FileRepository();
        SimpleRepositoryUI ui = new SimpleRepositoryUI(repo2);
        ui.display();
    }

}
