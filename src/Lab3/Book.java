package Lab3;

import java.util.ArrayList;

public class Book extends Media {
    private int stock;
    private ArrayList<String> reviews;

    public Book(String title, String auteur, String ISBN, double price, int stock, String review) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    

    public double getAverageRating() {
        if (reviews.isEmpty()) return 0;
        double sum = 0;
        
        for (Review r : reviews) sum += r.getRating();
        return sum / reviews.size();
    }

    public void purchase(User user) {
        if (quantityInStock > 0) {
            user.addPurchasedMedia(this);
            quantityInStock--;
            
            System.out.println(user.getUsername() + " purchased " + getTitle());
        } else {
            
            System.out.println("out");
        }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        quantityInStock + quantity;
        
        System.out.println( getTitle()  + quantity );
    }

    @Override
    public String getMediaType() {
        
        return isBestseller() ;
    }

    @Override
    public String toString() {
        
        return super.toString()  + quantityInStock   + getMediaType();
    }
    


    
}
