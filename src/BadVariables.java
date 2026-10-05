/**
 * Exercise 9 — Fix the Declarations
 *
 * SIX of the lines below are broken. Find them, fix them,
 * and add a comment on each fixed line saying what was wrong.
 *
 * One of them compiles fine but is still a bad idea. Find that one too.
 */
public class BadVariables {
    public static void main(String[] args) {

        int secondPlace = 5;    // Identifiers cannot begin with number

        double price = 9.99;    // the number cannot be in quotes or it will become string

        boolean isReady = true; // the number cannot be in quotes or it will become string


        char grade = 'A';     // char must have single quotation

        int gradeLevel = 11;

        String name = "Sarah";   // The N in string name should not be cap because vairiables start lowercase

        int  studentScore = 95;    // all vairiables have to be a single word

        System.out.println("If this runs, you fixed them all.");
    }
}
