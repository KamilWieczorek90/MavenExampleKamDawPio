package org.programator.decorator.library;

abstract class LibraryItem {
    private int numCopies;

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }
}
