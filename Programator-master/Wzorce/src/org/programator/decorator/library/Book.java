package org.programator.decorator.library;

class Book extends LibraryItem {
    private String author;
    private String title;

    public Book(String author, String title, int numCopies) {
        this.author = author;
        this.title = title;
        this.setNumCopies(numCopies);
    }

    public String toString() {
        return (new StringBuilder("Book: "))
                .append("\n\tAuthor: ")
                .append(author)
                .append("\n\tTitle: ")
                .append(title)
                .append("\n\t# Copies: ")
                .append(getNumCopies())
                .toString();
    }

}