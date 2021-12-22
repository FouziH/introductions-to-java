import java.io.Console;
public class TreeStory {
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */

        // String name = console.readLine("Enter your name:  ");
        // String adjective = console.readLine("Enter and adjective:  ");

        //Printing two variable on the console
        // console.printf("%s is very %s\n", name, adjective);

        //__name__ is a __adjective__ __noun__. They are always __adverb__ __verb__.

        String firstName = console.readLine("Enter your name:  ");
        String _adjective_ = console.readLine("Enter your name:  ");
        String _noun_ = console.readLine("Enter your name:  ");
        String _adverb_ = console.readLine("Enter your name:  ");
        String _verb_ = console.readLine("Enter your name:  ");

        console.printf("%s is a %s %s. They are always %s %s", firstName, _adjective_, _noun_,_adverb_, _verb_ );

        
    }
    
}
