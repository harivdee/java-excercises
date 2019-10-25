package excercisethree;

public class Author {
    private String name;
    private String email;
    private char gender;
    private static int counter;
    public Author() {
        counter++;
    }
    public static int getNumOfAuthors() {
        return counter;
    }
    
    public void setAuthorName(String name) {
        this.name = name;
    }
    
    public void setAuthorEmail(String email) {
        this.email = email;
    }
    
    public void setAuthorGender (char gender) {
//        if (gender != 'M' || gender != 'F') {
//            throw new IllegalArgumentException();
//        }
        this.gender = gender;
    }
    public String getAuthorName() {
        return this.name;
    }
    
    public String getAuthorEmail() {
        return this.email;
    }
    
    public char getAuthorGender() {
        return this.gender;
    }
}
