package Lab3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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


    }
}