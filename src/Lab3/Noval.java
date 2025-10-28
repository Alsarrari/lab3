package Lab3;

public class Noval extends Book{
    private String genre;
    //public Noval(){}


    public Noval(int stock, String review, String genre) {
        super(stock, review);
        this.genre = genre;
    }

    public Noval(String title, String auteur, String ISBN, double price, int stock, String review, String genre) {
        super(title, auteur, ISBN, price, stock, review);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
