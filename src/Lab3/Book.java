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
    


    
}
