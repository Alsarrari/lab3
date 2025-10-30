package Lab3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        
                Store store = new Store();

        
        User u1 = new User("abdulrhman", "ali@email.com");
        store.addUser(u1);

        Media media=new Media();
        media.getMediaType();
        media.getAuteur();
        media.getISBN();
        media.getPrice();
        media.getTitle();
        media.toString();
        System.out.println(media.getAuteur());
        System.out.println(media.getISBN());
        System.out.println(media.getMediaType());
        System.out.println(media.getPrice());
        System.out.println(media.getTitle());
        

        store.displayMedias();
        System.out.println();

        u1.addToCart(n1);
        u1.addToCart(m1);
        u1.checkout();

        System.out.println(n1.getTitle() +  n1.isBestseller());
    


    }
}
