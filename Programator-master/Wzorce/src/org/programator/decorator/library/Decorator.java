package org.programator.decorator.library;

abstract class Decorator extends LibraryItem {
    protected LibraryItem libraryItem;

    public Decorator(LibraryItem libraryItem) {
        this.libraryItem = libraryItem;
    }

    public String toString() {
        return libraryItem.toString();
    }
}
