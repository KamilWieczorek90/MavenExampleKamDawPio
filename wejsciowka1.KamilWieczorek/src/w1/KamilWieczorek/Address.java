package w1.KamilWieczorek;

import java.util.Objects;

public class Address implements Comparable<Address>{
    private String city;
    private String street;
    private int number;

    public Address() {
    }

    public Address(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getNumber() == address.getNumber() &&
                Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(getStreet(), address.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getNumber());
    }

    @Override
    public String toString() {
        return city + " ul. " + street  + " nr " + number;

    }

    @Override
    public int compareTo(Address o) {
//        Address adresToComper = (Address) o;
//        if (this.city > adresToComper.city){
//            return 1;
//        }else if
        return 0;
    }
}
//public int compareTo(Object o) {
//    Movie movieToComper = (Movie) o;
//    if (this.yearOfProduction > movieToComper.yearOfProduction) {
//        return 1;
//    }else if (this.yearOfProduction == movieToComper.yearOfProduction) {
//        return 0;
//    } else return -1;
//kolejności alfabetycznej nazw miast (pole city)
//jeżeli powyższe nie rozstrzyga, wg kolejności alfabetycznej nazw ulic (pole street)
//jeżeli powyższe nie rozstrzyga, wg kolejności rosnącej numerów budynku (pole number).
//}
//Person: Kowalski, ur.: 1950, zamieszkały: Łódź ul. Długa nr 15