package Kamil_Wieczorek.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<E> implements  IStack<E>{
    private List<E> listStack;


    public ListStack(){
        listStack = new ArrayList<E>();
    }

    @Override
    public void push(E element)  {
        listStack.add(element);
    }

    @Override
    public E pop() throws StackEmptyException {
        E a;
        if (listStack.isEmpty()){
            throw new StackEmptyException();
        }else{
            a = listStack.get(listStack.size() - 1);
            listStack.remove(listStack.size() - 1);
            return a;
        }
    }
    public boolean czyJestNaStosie(E element){
        return listStack.contains(element);
    }
}
