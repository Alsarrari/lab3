package Lab3;

public class Movie extends Media{
    private int duration;

    public Movie(){}

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
