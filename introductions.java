import java.io.Console;

public class introductions {
    public static void main(String args[]){
        Console console = System.console();
        //Welcome to the Introductions program! Your code goes below here
        String firstName = console.readLine("What is your first name? ");
        String lastName =console.readLine("What is your last name? ");
        console.printf("First name: %s\n", firstName);
        console.printf("Last name: %s\n", lastName);
    }
}