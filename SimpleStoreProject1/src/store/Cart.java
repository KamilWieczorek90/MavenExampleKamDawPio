package store;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> koszyk;


    public Cart() {
       koszyk = new ArrayList<>();
    }

    public void addProduct(Product p){
        koszyk.add(p);
    }
    public void deleteProduct(int i){
        koszyk.remove(i);
    }
    public void wyswietl(){
        for (Product product: koszyk){
            System.out.println(product);
        }
    }
    public double wyliczWartoscKoszyka(){
       double wartoscKoszyka = 0;
      for (Product product: koszyk){
          wartoscKoszyka += product.getPrice();
      } return wartoscKoszyka;
    }


}
