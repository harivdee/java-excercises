package excercisethree;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    
    public String getName() {
        return this.name;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public Author getAuthor() {
        //if(Author.getNumOfAuthors() > 1) {
        //throw new IllegalArgumentException();
        //}
        return this.author;
    }
    public double getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return this.qty;
    }
    public void setName(String title) {
        this.name = title;
    }
    
    public void setPrice(double price) {
        if(price<=0) {
            throw new IllegalArgumentException();
        }
        this.price = price;
    }
    public void setQuantity(int qty) {
        if(qty<=0) {
            throw new IllegalArgumentException();
        }
        this.qty = qty;
    }
    public String getAuthorName() {
        return this.author.getAuthorName(); 
    }
    public String getAuthorEmail() {
        return this.author.getAuthorEmail();
    }
    public char getAuthorGender() {
        return this.author.getAuthorGender();
    }
    
    @Override
    public String toString() {
        String details;
        details = "Book "+ this.name + ", Author " + this.author.getAuthorName() + ", email " + this.author.getAuthorEmail()
                + ", Gender " + this.author.getAuthorGender() + ", Price "+ this.price + ", Quantity " + this.qty;
        return details;
    }
    
    
}
