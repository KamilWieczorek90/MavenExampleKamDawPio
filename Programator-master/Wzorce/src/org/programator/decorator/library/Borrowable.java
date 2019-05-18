package org.programator.decorator.library;

import java.util.ArrayList;
import java.util.List;

class Borrowable extends Decorator {
    protected List<String> borrowers = new ArrayList<>();

    public Borrowable(LibraryItem libraryItem) {
        super(libraryItem);
    }

    public void borrowItem(String name) {
        borrowers.add(name);
        libraryItem.setNumCopies(libraryItem.getNumCopies() - 1);
    }

    public void returnItem(String name) {
        borrowers.remove(name);
        libraryItem.setNumCopies(libraryItem.getNumCopies() + 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (String borrower : borrowers)
            sb.append("\n\tborrower: ").append(borrower);
        return sb.toString();
    }
}
