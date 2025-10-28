package Lab3;

public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(int stock, String review, String subject) {
        super(stock, review);
        this.subject = subject;
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String review, String subject) {
        super(title, auteur, ISBN, price, stock, review);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
