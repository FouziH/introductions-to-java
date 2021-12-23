import java.io.Console;

public class Age {
    public static void main(String[] args) {
        Console console = System.console();
        // declare age using int variable
        String ageAsString = console.readLine("Enter your age:  ");

        int age = Integer.parseInt(ageAsString);
        if (age < 13) {
            // insert our exit code
            console.printf("You must be at least 13 years of age to use this program");
            System.exit(0);
        }
        String getNumberOfPeopleString = console.readLine("Enter number of people in your group:  ");
        int numberOfPeople = Integer.parseInt(getNumberOfPeopleString);

        if (numberOfPeople < 4) {
            console.printf("Your table is ready.\n\n");
            // exist the system after you run this code
            // System.exit(0);
        }

        String noun;
        boolean isInvalidWord;


        do {
            noun = console.readLine("Enter a noun:  ");
            isInvalidWord = noun.equalsIgnoreCase("dork") ||
                    noun.equalsIgnoreCase("jerk");
            if (isInvalidWord) {
                console.printf("That language is not allowed. Try again. \n\n");
            }

        } while (isInvalidWord);

        String firstExample = "hello";
        String secondExample = "hello";
        if (firstExample.equals(secondExample)) {
            console.printf("first is equal to second\n\n\n");
        }
        String thirdExample = "HELLO";

        if (firstExample.equalsIgnoreCase(thirdExample)) {
            console.printf("first and third are the same ignoring case");
        }

    }

}
