package org.programator.decorator.library;

class Video extends LibraryItem {
    private String director;
    private String title;
    private int playTime;

    public Video(String director, String title, int numCopies, int playTime) {
        this.director = director;
        this.title = title;
        this.setNumCopies(numCopies);
        this.playTime = playTime;
    }

    public String toString() {
        return (new StringBuilder("Video: "))
                .append("\n\tDirector: ")
                .append(director)
                .append("\n\tTitle: ")
                .append(title)
                .append("\n\t# Copies: ")
                .append(getNumCopies())
                .append("\n\tPlaytime: ")
                .append(playTime)
                .toString();
    }
}
