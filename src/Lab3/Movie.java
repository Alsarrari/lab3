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
    
    public void recommendSimilarMovies(List<Movie> movieCatalog) {
        System.out.println( getAuteur());
        
        for (Movie m : movieCatalog) {
            
            if (m.getAuteur().equals(this.getAuteur()) && !m.equals(this))
                System.out.println( m.getTitle());
        }
    }

    @Override
    public String getMediaType() {
        return duration >= 120 ;
    }

    @Override
    public String toString() {
        return super.toString() + duration +  getMediaType();
}
