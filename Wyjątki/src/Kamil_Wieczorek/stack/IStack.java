package Kamil_Wieczorek.stack;

public interface IStack<E>{
    void push(E element);
    E pop() throws StackEmptyException;
}
//Stos
//
//        Dany jest interfejs:
//public interface IStack {
//    void push(int element);
//    int pop();
//}


//Zadanie 1
//
//        Zdefiniuj klasę stosów implementującą interfejs IStack.
//
//        Pierwsza implementacja powinna bazować na tablicy o zadanym w konstruktorze rozmiarze. Jak reagować na zbyt dużą liczbę elementów w tablicy
//        Druga implementacja powinna bazować na ArrayList.
//
//        Klasa powinna reagować na próbę pobrania elementów z pustego stosu - zdefiniuj odpowiednie wyjątki.
//        Zademonstruj działanie programu. W programie głównym reaguj na wyjątki.
//
//
//        Zadanie 2
//
//        Powtórz powyższe zadanie 1 dla kolejek.
//        Koncepcja kolejek opisana w dokumencie:
//        https://computersciencewiki.org/index.php/Queue
