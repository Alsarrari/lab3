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


    public void mediaList(Media media) {
        mediaList.add(media);
    }
//    public void setUsers(String users){
//        this.users=users;
//    }

}




