package comparowanie;

public class Movie implements Comparable {
    private String title;
    private int yearOfProduction;
    private double rating;
    private long voteSum;
    private double price;

    public Movie(String title, int yearOfProduction, double rating, long voteSum, double price) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
        this.rating = rating;
        this.voteSum = voteSum;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public long getVoteSum() {
        return voteSum;
    }

    public void setVoteSum(long voteSum) {
        this.voteSum = voteSum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", rating=" + rating +
                ", voteSum=" + voteSum +
                ", price=" + price +
                '}';
    }

    @Override
        public int compareTo(Object o) {
        Movie movieToComper = (Movie) o;
        if (this.yearOfProduction > movieToComper.yearOfProduction) {
            return 1;
        }else if (this.yearOfProduction == movieToComper.yearOfProduction) {
                return 0;
            } else return -1;

        }
    }
