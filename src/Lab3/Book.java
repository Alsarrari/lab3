package Lab3;

import java.util.ArrayList;

public class Book extends Media {
    private int stock;
    private ArrayList<String> reviews;
//
//    public Book(int stock, String review) {
//        this.stock = stock;
//        this.eview = review;
//    }

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
//
//    public String getReview() {
//        return reviews;
//    }
//
//    public void setReview(String review) {
//        this.reviews = review;
//    }



}
