package Lab3;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void addToCart(Media media) {
        cart.add(media);
        System.out.println(media.getTitle() +  username + "'s cart.");
    }

    public void removeFromCart(Media media) {
        cart.remove( media);
        System.out.println(media.getTitle() );
    }

    public void checkout() {
        for (Media m : cart ) {
            purchased.add (m );
            
  System.out.println(username + m.getTitle());
        }
        cart.clear();
    }

    public void addPurchasedMedia(Media media) {
        purchased.add(media);
    }
}
