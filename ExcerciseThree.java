package excercisethree;


public class ExcerciseThree {


    public static void main(String[] args) {
        Author jkRowlings = new Author();
        jkRowlings.setAuthorName("Joanne");
        jkRowlings.setAuthorGender('F');
        jkRowlings.setAuthorEmail("jkRowlings@gmail.com");
        Book harryPotter1 = new Book();
        harryPotter1.setAuthor(jkRowlings);
        harryPotter1.setName("Philosophers Stone");
        harryPotter1.setPrice(39.99);
        harryPotter1.setQuantity(5);
        
        System.out.println(harryPotter1.toString());
    }
}
