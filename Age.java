import java.io.Console;
public class Age {
    public static void main(String[] args) {
         Console console = System.console();
         //declare age using int variable
        String ageAsString = console.readLine("Enter your age:  ");

         int age = Integer.parseInt(ageAsString);
         if(age < 13) {
             //insert our exit code
             console.printf("You must be at least 13 years of age to use this program");
             System.exit(0);
         }
         String getNumberOfPeopleString = console.readLine("Enter number of people in your group:  ");
         int numberOfPeople = Integer.parseInt(getNumberOfPeopleString);

         if(numberOfPeople < 4) {
             console.printf("Your table is ready.");
             //exist the system after you run this code
            //  System.exit(0);
         }


         String noun = console.readLine("Enter a noun:  ");
         if(noun.equals("dork")) {
             console.printf("That language is not allowed. Exiting. \n\n");
             System.exit(0);
         }


    }

    

    
}
