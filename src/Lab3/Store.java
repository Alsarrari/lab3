package Lab3;
import java.util.ArrayList;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media> mediaList;

    public Store() {
        users = new ArrayList<>();
        mediaList = new ArrayList<>();
    }

    public void users(User user) {
        users.add(user);
    }
    
    public void displayUsers() {
        for (User u : users) {
            System.out.println( u.getUsername());
        }


    public void mediaList(Media media) {
        mediaList.add(media);
    }
    
    public void displayMedias() {
        for (Media m : medias) {
            System.out.println(m);
        }
    }

    public Book searchBook(String title) {
        for (Media m : medias) {
            if (m instanceof Book && m.getTitle().equalsIgnoreCase(title))
                return (Book) ;
        }
    
    
}




