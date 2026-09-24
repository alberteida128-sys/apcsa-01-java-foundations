/**
 * Exercise 7 — AboutMe
 *
 * TODO: Declare and initialize at least one variable of EACH type:
 *     int, double, boolean, char, String
 *
 * Then print each one with a descriptive label.
 *
 * Requirements:
 *   - Use camelCase names
 *   - Names must be descriptive (favoriteNumber, not x)
 *   - Include at least one `final` constant in ALL_CAPS
 */
public class AboutMe {
    public static void main(String[] args) {
        final int BIRTH_YEAR = 2010;
        String birthMonth = "july" ;
        char grode = 'A'; 
        int favoriteNumber = 7; 
        double favoriteDecimal = 3.14; 
        boolean likesJava = true; 
        char favoriteInitial = 'A'; 
        String name = "YOUR_NAME"; 
        
        System.out.println("Name: " + name);
        System.out.println("Birth year: " + BIRTH_YEAR);
        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Favorite decimal: " + favoriteDecimal);
        System.out.println("Likes Java: " + likesJava);
        System.out.println("Favorite initial: " + favoriteInitial);

    }
}
