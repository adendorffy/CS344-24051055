import java.util.Scanner;

/** 
 * 
 * This is a class for greeting the user through different means
 * 
*/


public class Greeter {

    public static void main(String [] args){
        if(args.length != 1){
            System.out.println("Usage: java Greeter <name>");
        }else{
            greeter(args[0]);
        }
    }

    public static void greeter(String name){
        /**
         * Function for printing a greeting to the terminal using the name value 
         * @param name The name to use in the greeting 
         */

        System.out.println("Hello,  " + name + ", this is a longer greeting.");
    }

    public static String GetName(){
        /**
         * Function for greeting by prompting the user to enter a name through standard input 
         * @return name The name that the user entered into standard input
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        return name;
    }

}