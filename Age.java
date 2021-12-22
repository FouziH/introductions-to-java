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

    }
    
}
