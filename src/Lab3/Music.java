package Lab3;

public class Music extends Media{
    private String artist;

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public void listen(User user) {
        user.addPurchasedMedia(this);
        System.out.println(user.getUsername() getTitle());
    }

    public void generatePlaylist(List<Music> musicCatalog) {
        System.out.println( artist );
        
        for (Music m : musicCatalog) {
            if (m.artist.equals(this.artist))
                
                System.out.println( m.getTitle());
        }


    @Override
    public String toString() {
        return "Music" +artist ;
    }
        
    @Override
    public String toString() {
        return super.toString() +  artist + getMediaType();
    }
}
