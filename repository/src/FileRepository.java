import sun.reflect.generics.repository.FieldRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRepository implements Repository {

    private final static String FILE_NAME = "c:\\temp\\simple-repository.txt";

    @Override
    public List<String> getAll() {
        File plik = new File(FILE_NAME);
        List<String> lista = new ArrayList<>();
        try {

            FileReader fileReader = new FileReader(plik);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true){
                String linia = bufferedReader.readLine();
                if (linia == null) break;
                lista.add(linia);
            }
            bufferedReader.close(); //powinno to być w bloku finally
        }
        catch (FileNotFoundException e){
        }
        catch   (IOException e) {
        }
        return lista;
    }

    @Override
    public void add(String element) {
        List<String> lista = getAll();
        lista.add(element);
        zapiszPlik(lista);
    }

    @Override
    public void update(int index, String element) {
        List<String> lista = getAll();
        lista.remove(index);
        lista.add(index, element);
        zapiszPlik(lista);
    }

    @Override
    public void remove(int index) {
        List<String> lista = getAll();
        lista.remove(index);
        zapiszPlik(lista);
    }

    @Override
    public void remove(String element) {
        List<String> lista = getAll();
        lista.remove(element);
        zapiszPlik(lista);
    }

    private void zapiszPlik(List<String> lista){
        File plik = new File(FILE_NAME);
        try {
            FileWriter fileWriter = new FileWriter(plik);
            for (String wiersz : lista) {
                fileWriter.write(wiersz + "\r\n");
            }
            fileWriter.close();
        } catch (FileNotFoundException e){
        } catch   (IOException e) {
        }
    }
}