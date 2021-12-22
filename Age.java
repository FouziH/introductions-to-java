import java.io.Console;
public class Age {
    public static void main(String[] args) {
         Console console = System.console();
         //declare age using int variable

         int age = 12;
         if(age < 13) {
             //insert our exit code
             console.printf("You must be at least 13 years of age to use this program");
             System.exit(0);
         }

         int numberOfPeople = 3;

         if(numberOfPeople < 4) {
             console.printf("Your table is ready.");
             //exist the system after you run this code
             System.exit(0);
         }

    }
    
}
