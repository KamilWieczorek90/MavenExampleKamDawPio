package org.programator.decorator.library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Worley", "Inside ASP.NET", 10);
        System.out.println(book);

        Video video = new Video("Spielberg", "Jaws", 23, 92);
        System.out.println(video);

        System.out.println("\nMaking video borrowable:");

        Borrowable borrowVideo = new Borrowable(video);
        borrowVideo.borrowItem("Customer #1");
        borrowVideo.borrowItem("Customer #2");

        System.out.println(borrowVideo);

        borrowVideo.returnItem("Customer #1");
        System.out.println(borrowVideo);

    }
}
