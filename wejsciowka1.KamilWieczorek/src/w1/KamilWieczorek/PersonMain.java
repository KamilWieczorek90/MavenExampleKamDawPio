package w1.KamilWieczorek;

public class PersonMain {

    public static void main(String[] args) {
	Address adresPusty = new Address();
	Address adresPelny = new Address("Bydgoszcz", "Wysoka", 2);

	Person osoba1 = new Person();
	Person osoba2 = new Person("Waldemar" , 1990, adresPelny);

		System.out.println(osoba2);
    }
}


//        Gettery i settery:
//      !!  settery powinny realizować następujące sprawdzenia poprawności wprowadzanych wartości do pól:
//        name: powinno się rozpoczynać od dużej litery
//        yearOfBirth: powinien być z przedziału od 1950 do 2000
//        Implementację metody toString() dziedziczonej z klasy Object, prezentującą obiekt klasy Person w następujący sposób:
//     !!!   Person: Kowalski, ur.: 1950, zamieszkały: Łódź ul. Długa nr 15
//        Implementację metod equals() i hashCode() dziedziczonych z klasy Object.
//        Utwórz klasę PersonMain i w jej metodzie main(...) prezentującą:
//        tworzenie obiektu Person za pomocą obu konstruktorów